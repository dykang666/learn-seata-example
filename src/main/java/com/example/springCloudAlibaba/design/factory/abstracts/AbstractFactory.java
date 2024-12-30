package com.example.springCloudAlibaba.design.factory.abstracts;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * 为 Color 和 Shape 对象创建抽象类来获取工厂
 * @date 2024/5/28 16:41
 */
public abstract  class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
