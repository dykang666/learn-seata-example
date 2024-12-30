package com.example.springCloudAlibaba.design.proxy;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 13:47
 */
public class Test {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");
        //代理模式
        Proxy proxy = new Proxy(jiaojiao);
        proxy.GiveChocolate();
        proxy.GiveDolls();
        proxy.GiveFlowers();
    }
}
