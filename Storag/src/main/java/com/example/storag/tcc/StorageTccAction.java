package com.example.storag.tcc;

import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.rm.tcc.api.BusinessActionContextParameter;
import io.seata.rm.tcc.api.LocalTCC;
import io.seata.rm.tcc.api.TwoPhaseBusinessAction;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/30 12:38
 */
@LocalTCC
public interface StorageTccAction {
    /**
     * try 尝试
     *
     * BusinessActionContext 上下文对象，用来在两个阶段之间传递数据
     * BusinessActionContextParameter 注解的参数数据会被存入 BusinessActionContext
     * TwoPhaseBusinessAction
     * 注解中commitMethod、 默认为commit
     * rollbackMethod  默认为 rollback
     * 属性有默认值，可以不写
     *
     * @param businessActionContext
     * @param productId
     * @param count
     * @return
     */
    @TwoPhaseBusinessAction(name = "storageTccAction")
    boolean prepareDecreaseStorage(BusinessActionContext businessActionContext,
                                   @BusinessActionContextParameter(paramName = "productId") Long productId,
                                   @BusinessActionContextParameter(paramName = "count") Integer count);


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
