package com.example.account.api;


import com.example.account.dto.Account;
import com.example.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author liuyongtao
 * @since 2021-3-2 11:36
 */
@RestController
public class AccountApi {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{id}")
    public Account findById(@PathVariable("id") Long id) {
        return accountService.getById(id);
//        return new Account();
    }

    @PostMapping("/subAccount/{userId}")
    public boolean subAccount(@PathVariable("userId") String userId, @RequestParam("money") Integer money) {
        return accountService.subAccount(userId, money);
    }

    @PostMapping("/addAccount/{userId}")
    public boolean addAccount(@PathVariable("userId") String userId, @RequestParam("money") Integer money) {
        accountService.addAccount(userId, money);
        return true;
    }
}
