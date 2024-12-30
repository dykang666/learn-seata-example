package com.example.springCloudAlibaba.design.prototype;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 19:44
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }
    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
