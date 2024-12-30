package com.example.springCloudAlibaba.design.Builder;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 冷饮
 * @date 2024/5/24 21:12
 */
public abstract class ColdDrink implements  Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
