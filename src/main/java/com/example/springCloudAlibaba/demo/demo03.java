package com.example.springCloudAlibaba.demo;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/4 11:36
 */
public class demo03 { // 实例初始化块
    {
        System.out.println("实例初始化块执行了...");
    }

    // 类初始化块
    static {
        System.out.println("类初始化块执行了...");
    }

    // 构造器
    public demo03() {
        System.out.println("无参构造器执行了...");
    }

    public static void main(String[] args) {
        new demo03();
        System.out.println("------------------");
        new demo03();
    }
}
