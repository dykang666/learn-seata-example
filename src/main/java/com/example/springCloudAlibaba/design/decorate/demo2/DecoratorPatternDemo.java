package com.example.springCloudAlibaba.design.decorate.demo2;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 意图：动态地给一个对象添加一些额外的职责。
 * 就增加功能来说，装饰器模式相比生成子类更为灵活。
 * 使用场景： 1、扩展一个类的功能。 2、动态增加功能，动态撤销。
 * @date 2024/5/24 20:32
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
//        System.out.println("Circle with normal border");
//        circle.draw();
        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
