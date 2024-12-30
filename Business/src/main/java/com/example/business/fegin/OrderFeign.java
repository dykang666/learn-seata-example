package com.example.business.fegin;

import com.example.business.vo.OrderVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/29 17:03
 */
@FeignClient(name = "Order-Service")
public interface  OrderFeign {
    @PostMapping("/order/insertOrder")
    boolean insertOrder(@RequestBody OrderVo order);
}
