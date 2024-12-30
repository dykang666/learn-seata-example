package com.example.springCloudAlibaba.design.stencil;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 纯豆浆
 * @date 2024/5/24 20:09
 */
public class PureSoyaMilk  extends SoyaMilk{
    @Override
    void addCondiment() {
    }
    @Override
    boolean customerWantCondiment() {
        return false;
    }
}
