package com.example.springCloudAlibaba.design.Builder;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 素食汉堡
 * @date 2024/5/24 21:13
 */
public class VegBurger extends Burger{


    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
