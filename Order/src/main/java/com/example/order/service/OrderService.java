package com.example.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.order.dto.Order;
import com.example.order.dto.OrderDO;


/**
 * @author liuyongtao
 * @since 2021-3-2 11:36
 */
public interface OrderService extends IService<Order> {

    boolean insertOrder(Order order);

    /**
     * 创建订单
     * @param orderDO
     */
    void createOrder(OrderDO orderDO);


}
