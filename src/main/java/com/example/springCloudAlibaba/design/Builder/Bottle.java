package com.example.springCloudAlibaba.design.Builder;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:瓶子
 * @date 2024/5/24 21:09
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
