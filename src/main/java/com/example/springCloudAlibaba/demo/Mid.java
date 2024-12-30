package com.example.springCloudAlibaba.demo;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/4 12:01
 */
public class Mid extends Root{
    static {
        System.out.println("Mid-->静态初始化块");
    }

    {
        System.out.println("Mid-->实例初始化块");
    }
    public Mid(String msg) {
        // 调用同一个类中的无参构造器
        this();
        System.out.println("Mid-->有参构造器，参数：" + msg);
    }
    public Mid() {
        System.out.println("Mid-->无参构造器");
    }

}
