package com.example.springCloudAlibaba.design.decorate;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 12:40
 */
public class Person {
    public Person()    { }
    private String name;
    public Person( String name)
    {
        this.name = name;
    }
    public  void Show()
    {
        System.out.println("装扮的{0}\"，+name:"+name);
    }
}
