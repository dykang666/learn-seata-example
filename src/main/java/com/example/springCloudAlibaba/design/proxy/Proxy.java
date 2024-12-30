package com.example.springCloudAlibaba.design.proxy;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 13:42
 */
public class Proxy implements IGiveGift{
    Pursuit  gg;
    public Proxy(SchoolGirl mm) {
        this.gg = new Pursuit(mm);
    }


    @Override
    public void GiveDolls() {
        gg.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        gg.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
        gg.GiveChocolate();
    }
}
