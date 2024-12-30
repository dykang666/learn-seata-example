package com.example.business.api;

import com.example.business.service.BusinessService;
import com.example.business.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/29 17:02
 */
@RestController
@RequestMapping("/business")
public class BusinessApi {
    @Autowired
    private BusinessService businessService;

    @PostMapping
    public boolean business(@RequestBody OrderVo orderVo) {
        return businessService.business(orderVo);
    }
}
