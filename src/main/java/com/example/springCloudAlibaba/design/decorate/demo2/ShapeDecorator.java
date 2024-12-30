package com.example.springCloudAlibaba.design.decorate.demo2;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 形状装饰器
 * @date 2024/5/24 20:36
 */
public abstract  class ShapeDecorator implements Shape  {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }

}
