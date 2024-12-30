package com.example.springCloudAlibaba.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/13 21:01
 */
@Configuration
public class AppConfig {
    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
    public class MyBean {
        public MyBean() {
            System.out.println("MyBean Initializing");
        }
    }
}
