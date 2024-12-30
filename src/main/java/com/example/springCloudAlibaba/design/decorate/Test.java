package com.example.springCloudAlibaba.design.decorate;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 12:53
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("小王");
        System.out.println("第一种装扮");
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();
        tShirts.Decorate(person);
        //装饰者模式
        bigTrouser.Decorate(tShirts);
        bigTrouser.Show();

    }

}
