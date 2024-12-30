package com.example.springCloudAlibaba.demo;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/4 12:01
 */
public class Root {
    static {
        System.out.println("Root-->静态初始化块");
    }
    {
        System.out.println("Root-->实例初始化块");
    }
    public Root() {
        System.out.println("Root-->无参构造器");
    }

}
