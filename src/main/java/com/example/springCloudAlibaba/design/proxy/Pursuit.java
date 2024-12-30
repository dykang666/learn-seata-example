package com.example.springCloudAlibaba.design.proxy;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 追求者
 * @date 2024/5/24 13:37
 */
public class Pursuit implements IGiveGift{
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }


    @Override
    public void GiveDolls() {
        System.out.println(mm+"送你洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        System.out.println(mm+"送你鲜花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(mm+"送你巧克力");
    }
}
