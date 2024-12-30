package com.example.springCloudAlibaba.design.Builder;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 汉堡包
 * @date 2024/5/24 21:11
 */
public abstract  class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
