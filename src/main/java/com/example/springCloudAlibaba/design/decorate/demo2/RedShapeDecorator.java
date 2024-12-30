package com.example.springCloudAlibaba.design.decorate.demo2;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 红色形状装饰器
 * @date 2024/5/24 20:37
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
