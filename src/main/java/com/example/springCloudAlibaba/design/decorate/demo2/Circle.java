package com.example.springCloudAlibaba.design.decorate.demo2;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 20:35
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
