package com.example.order.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.order.dao.OrderDao;
import com.example.order.dao.OrderMapper;
import com.example.order.dto.Order;
import com.example.order.dto.OrderDO;
import com.example.order.feign.AccountFeign;
import com.example.order.feign.StorageFeign;
import com.example.order.service.OrderService;
import com.example.order.tcc.OrderTccService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author liuyongtao
 * @since 2021-3-2 15:57
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private  OrderTccService orderTccService ;
    @Autowired
    private AccountFeign accountFeign;
    @Autowired
    private StorageFeign storageFeign;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean insertOrder(Order order) {
        orderDao.insert(order);
        accountFeign.subAccount(order.getUserId(), order.getMoney());
        return true;
    }
    /**
     * 创建订单
     * @param orderDO
     */
    @GlobalTransactional
    @Override
    public void createOrder(OrderDO orderDO) {
        String orderNo=this.generateOrderNo();
        //创建订单
        orderTccService.prepareCreateOrder(null,
                orderNo,
                orderDO.getUserId(),
                orderDO.getProductId(),
                orderDO.getAmount(),
                orderDO.getMoney());
        //扣余额
        accountFeign.decreaseMoney(orderDO.getUserId(),orderDO.getMoney());
        //扣库存
        storageFeign.decreaseStorage(orderDO.getProductId(),orderDO.getAmount());
    }



    private String generateOrderNo(){
        return LocalDateTime.now()
                .format(
                        DateTimeFormatter.ofPattern("yyMMddHHmmssSSS")
                );
    }

}
