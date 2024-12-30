package com.example.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author liuyongtao
 * @since 2021-3-2 16:51
 */
@FeignClient(name = "Account-Service")
public interface AccountFeign {

    @PostMapping("/account/subAccount/{userId}")
    boolean subAccount(@PathVariable("userId") String userId, @RequestParam("money") Integer money);

    /**
     * 扣余额
     * @param userId 用户id
     * @param money 金额
     * @return
     */
    @GetMapping("/account/decrease-money")
    String decreaseMoney(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
