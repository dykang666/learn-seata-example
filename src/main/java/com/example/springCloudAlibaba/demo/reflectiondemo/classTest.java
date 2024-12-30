package com.example.springCloudAlibaba.demo.reflectiondemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/15 17:19
 */
public class classTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Logger logger= LoggerFactory.getLogger("classTest");
        System.out.println("根据类名:  \t" + User.class);
        logger.info("根据对象:  \t" + new User().getClass());
        logger.info("根据全限定类名:\t" + Class.forName("com.example.springCloudAlibaba.demo.reflectiondemo.User"));
    }
}
