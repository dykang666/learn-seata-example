package com.example.springCloudAlibaba.design.decorate.demo2;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 长方形
 * @date 2024/5/24 20:34
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
