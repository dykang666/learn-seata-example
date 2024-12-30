package com.example.account.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.account.dto.Account;

import java.math.BigDecimal;

/**
 * @author liuyongtao
 * @since 2021-3-2 11:36
 */
public interface AccountService extends IService<Account> {

    boolean subAccount(String userId, Integer money);

    boolean addAccount(String userId, Integer money);

    /**
     * 账户扣钱
     * @param userId 用户id
     * @param money 扣钱金额
     * @return
     */
    void decreaseMoney(Long userId, BigDecimal money);
}
