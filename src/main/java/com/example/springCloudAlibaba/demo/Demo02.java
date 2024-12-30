package com.example.springCloudAlibaba.demo;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/4 10:46
 */
public class Demo02 {
    // 实例初始化块
    {
        System.out.println("实例初始化块执行了...");
    }

    // 类初始化块
    static {
        System.out.println("类初始化块执行了...");
    }

    // 构造器
    public Demo02() {
        System.out.println("无参构造器执行了...");
    }

    public static void main(String[] args) {
        new Demo02();
        System.out.println("------------------");
        new Demo02();
    }



}
