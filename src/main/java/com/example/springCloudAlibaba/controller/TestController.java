package com.example.springCloudAlibaba.controller;


import com.example.my2springbootsater.demo2.conf.SplitAutoConfigure;
import com.example.my2springbootsater.demo2.service.ISplitService;
import com.example.my2springbootsater.demo3.MyStarterConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/10 21:04
 */
@RestController
@RequestMapping("/testController")
public class TestController {
    @Autowired
    private  ISplitService iSplitService;

    @Autowired
    private MyStarterConfig myStarterConfig;

    @Autowired
    private SplitAutoConfigure splitAutoConfigure;

    @GetMapping("/splitTest")
    public List<String> splitTest() {
      return iSplitService.split("kangdong,yang");
    }
    @GetMapping("/testMyStarter")
    public String testMyStarter() {
        return   myStarterConfig.getName();
    }


}
