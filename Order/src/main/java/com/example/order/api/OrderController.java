package com.example.order.api;

import com.example.order.dto.OrderDO;
import com.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/30 11:57
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private  OrderService orderService;

    /**
     * 创建订单
     *
     * @param orderDO
     * @return
     */
    @PostMapping("/create")
    public String createOrder(@RequestBody OrderDO orderDO) {
        try {
            orderService.createOrder(orderDO);
        } catch (Exception e) {
            e.printStackTrace();
            return "fail：创建订单失败！";
        }
        return "success：创建订单成功！";
    }


}
