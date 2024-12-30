package com.example.account.api;

import com.example.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/30 12:14
 */
@RestController
public class AccountController {
    @Autowired
    private  AccountService accountService;
    /**
     * 账户扣钱
     * @param userId
     * @param money
     * @return
     */
    @GetMapping("decrease-money")
    public String decreaseMoney(Long userId, BigDecimal money){
        accountService.decreaseMoney(userId,money);
        return "Account 扣减金额成功！";
    }
}
