package com.example.springCloudAlibaba.design.factory.abstracts;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/28 16:42
 */
public class ShapeFactory extends  AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
