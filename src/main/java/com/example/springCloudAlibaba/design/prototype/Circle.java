package com.example.springCloudAlibaba.design.prototype;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 19:39
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
