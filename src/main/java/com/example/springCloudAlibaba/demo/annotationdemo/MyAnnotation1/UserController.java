package com.example.springCloudAlibaba.demo.annotationdemo.MyAnnotation1;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/3 14:10
 */
public class UserController {
    @MyAnnotation(name = "张三",age = 18,hobby = {"跑步，打游戏"})
    public String get(){
        return "Hello Annotation";
    }
}
