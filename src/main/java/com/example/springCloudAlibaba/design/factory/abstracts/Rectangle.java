package com.example.springCloudAlibaba.design.factory.abstracts;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/28 16:36
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
