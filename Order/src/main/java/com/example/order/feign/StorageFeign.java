package com.example.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/30 11:59
 */
@FeignClient(name = "Storage-Service")
public interface StorageFeign {
    /**
     * 扣库存
     * @param productId 产品id
     * @param count 产品数量
     * @return
     */
    @PostMapping("/storage/decrease-storage")
    String decreaseStorage(@RequestParam("productId")Long productId, @RequestParam("count")Integer count);
}
