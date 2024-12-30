package com.example.account.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/30 12:24
 */
@Data
public class AccountDO {
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 剩余可用额度
     */
    private BigDecimal residue;
    /**
     * TCC事务锁定的金额
     */
    private BigDecimal frozen;
}
