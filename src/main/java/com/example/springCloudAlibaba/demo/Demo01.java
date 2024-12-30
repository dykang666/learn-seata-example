package com.example.springCloudAlibaba.demo;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/4 11:13
 */
public class Demo01 {
//    // 声明实例变量的默认值在前
//    public int a = 10;
//
//    // 实例初始化块在后
//    {
//        a = 20;
//    }
//
//    public Demo01() {
//    }
//
//    public static void main(String[] args) {
//        Demo01 demo01 = new Demo01();
//        System.out.println(demo01.a); // 20
//    }

    // 实例初始化块在前
    {
        a = 20;
    }

    // 声明实例变量的默认值在后
    public int a = 10;

    public Demo01() {
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        System.out.println(demo01.a); // 10
    }
}
