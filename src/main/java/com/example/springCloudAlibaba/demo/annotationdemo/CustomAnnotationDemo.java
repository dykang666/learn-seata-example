package com.example.springCloudAlibaba.demo.annotationdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/3 13:31
 */
@RestController
public class CustomAnnotationDemo {
    @GetMapping("/hello")
    @CustomAnnotation("This is a custom annotation")
    public String hello() {
        return "Hello World!";
    }
}
