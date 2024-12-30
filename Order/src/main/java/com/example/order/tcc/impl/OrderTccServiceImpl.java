package com.example.order.tcc.impl;

import com.example.order.dao.OrderMapper;
import com.example.order.dto.OrderDO;
import com.example.order.tcc.OrderTccService;
import com.example.order.tcc.ResultHolder;
import io.seata.rm.tcc.api.BusinessActionContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/30 11:37
 */

@Slf4j
@Component
public class OrderTccServiceImpl implements OrderTccService {
    @Autowired
    private  OrderMapper orderMapper;
    /**
     * try 尝试
     *
     * BusinessActionContext 上下文对象，用来在两个阶段之间传递数据
     * BusinessActionContextParameter 注解的参数数据会被存入 BusinessActionContext
     * TwoPhaseBusinessAction 注解中commitMethod、rollbackMethod 属性有默认值，可以不写
     *
     * @param businessActionContext
     * @param orderNo
     * @param userId
     * @param productId
     * @param amount
     * @param money
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean prepareCreateOrder(BusinessActionContext businessActionContext, String orderNo, Long userId, Long productId, Integer amount, BigDecimal money) {
        OrderDO orderDO = new OrderDO(orderNo, userId, productId, amount, money, 0);
        orderMapper.saveData(orderDO);
        ResultHolder.setResult(OrderTccService.class, businessActionContext.getXid(), "p");
        return true;
    }
    /**
     * commit 提交
     *
     * @param businessActionContext
     * @return
     */
    @Override
    public boolean commit(BusinessActionContext businessActionContext) {
        //检查标记是否存在，如果标记不存在不重复提交
        String p = ResultHolder.getResult(OrderTccService.class, businessActionContext.getXid());
        if (p == null){
            return true;
        }

        /**
         * 上下文对象从第一阶段向第二阶段传递时，先转成了json数据，然后还原成上下文对象
         * 其中的整数比较小的会转成Integer类型，所以如果需要Long类型，需要先转换成字符串在用Long.valueOf()解析。
         */
        String orderNo = businessActionContext.getActionContext("orderNo").toString();
        orderMapper.updateStatusByOrderNo(orderNo, 1);
        //提交完成后，删除标记
        ResultHolder.removeResult(OrderTccService.class, businessActionContext.getXid());
        return true;
    }
    /**
     * cancel 撤销
     *
     * 第一阶段没有完成的情况下，不必执行回滚。因为第一阶段有本地事务，事务失败时已经进行了回滚。
     * 如果这里第一阶段成功，而其他全局事务参与者失败，这里会执行回滚
     * 幂等性控制：如果重复执行回滚则直接返回
     *
     * @param businessActionContext
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean rollback(BusinessActionContext businessActionContext) {
        //检查标记是否存在，如果标记不存在不重复提交
        String p = ResultHolder.getResult(OrderTccService.class, businessActionContext.getXid());
        if (p == null){
            return true;
        }
        String orderNo = businessActionContext.getActionContext("orderNo").toString();
        orderMapper.deleteByOrderNo(orderNo);
        //提交完成后，删除标记
        ResultHolder.removeResult(OrderTccService.class, businessActionContext.getXid());
        return true;
    }
}
