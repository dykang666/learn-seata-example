package com.example.springCloudAlibaba.design.prototype;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 长方形
 * @date 2024/5/24 19:36
 */
public class Rectangle extends  Shape {

    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
