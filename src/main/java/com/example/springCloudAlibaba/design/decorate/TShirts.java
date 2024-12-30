package com.example.springCloudAlibaba.design.decorate;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 具体服饰类
 * @date 2024/5/24 12:50
 */
public class TShirts  extends Finery{

    @Override
    public  void Show()    {
        System.out.println("大T恤 ");
        super.Show();
    }

}
