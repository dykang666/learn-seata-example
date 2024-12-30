package com.example.business.service.impl;

import com.example.business.fegin.OrderFeign;
import com.example.business.fegin.StorageFeign;
import com.example.business.service.BusinessService;
import com.example.business.vo.OrderVo;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/29 17:08
 */
@Service
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private OrderFeign orderFeign;
    @Autowired
    private StorageFeign storageFeign;
    @Override
    @GlobalTransactional
    public boolean business(OrderVo orderVo) {
        orderFeign.insertOrder(orderVo);
        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }
        storageFeign.subStorage(orderVo.getCommodityCode(), orderVo.getCount());
        return true;
    }
}
