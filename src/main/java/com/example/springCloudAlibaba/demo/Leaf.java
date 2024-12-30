package com.example.springCloudAlibaba.demo;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/4 12:02
 */
public class Leaf  extends Mid{
    static {
        System.out.println("Leaf-->静态初始化块");
    }

    {
        System.out.println("Leaf-->实例初始化块");
    }

    public Leaf() {
        super("java");
        System.out.println("Leaf-->无参构造器");

    }
}
