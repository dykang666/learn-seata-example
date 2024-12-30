package com.example.account.tcc;

import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.rm.tcc.api.BusinessActionContextParameter;
import io.seata.rm.tcc.api.LocalTCC;
import io.seata.rm.tcc.api.TwoPhaseBusinessAction;

import java.math.BigDecimal;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * tcc  是应用层的两阶段提交；
 *
 * @date 2024/12/30 12:17
 */
@LocalTCC
public interface AccountTccService {
    /**
     * try 尝试
     *  执行资源检查及预留操作
     * BusinessActionContext 上下文对象，用来在两个阶段之间传递数据
     * BusinessActionContextParameter 注解的参数数据会被存入 BusinessActionContext
     * TwoPhaseBusinessAction 注解中commitMethod、rollbackMethod 属性有默认值，可以不写
     *
     * @param businessActionContext
     * @param userId
     * @param money
     * @return
     */
    @TwoPhaseBusinessAction(name = "accountTccAction")
    boolean prepareDecreaseMoney(BusinessActionContext businessActionContext,
                                 @BusinessActionContextParameter(paramName = "userId")Long userId,
                                 @BusinessActionContextParameter(paramName = "money") BigDecimal money);

    /**
     * commit 提交
     * @param businessActionContext
     * @return
     */
    boolean commit(BusinessActionContext businessActionContext);

    /**
     * cancel 撤销
     * @param businessActionContext
     * @return
     */
    boolean rollback(BusinessActionContext businessActionContext);
}
