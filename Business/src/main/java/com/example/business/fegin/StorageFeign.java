package com.example.business.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/29 17:03
 */
@FeignClient(name = "Storage-Service")
public interface StorageFeign {
    @PostMapping("/storage/subStorage/{commodityCode}")
    boolean subStorage(@PathVariable("commodityCode") String commodityCode, @RequestParam("count") Integer count);
}
