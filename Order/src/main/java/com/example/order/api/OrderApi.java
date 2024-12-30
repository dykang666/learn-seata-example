package com.example.order.api;


import com.example.order.dto.Order;
import com.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyongtao
 * @since 2021-3-2 11:36
 */
@RestController
public class OrderApi {

    @Autowired
    private OrderService orderService;

    @PostMapping("/insertOrder")
    public boolean insertOrder(@RequestBody Order order) {
        return orderService.insertOrder(order);
    }

}
