package com.example.springCloudAlibaba.design.decorate;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 服饰
 * @date 2024/5/24 12:46
 */
public class Finery  extends Person {
    protected Person component;

    //打扮 装饰
    public void Decorate(Person component)    {
        this.component = component;
    }
   @Override
    public  void Show()    {
        if(component != null)
        {
            component.Show();
        }
    }


}
