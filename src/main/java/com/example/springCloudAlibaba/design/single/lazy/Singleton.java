package com.example.springCloudAlibaba.design.single.lazy;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 懒汉式，线程不安全
 * @date 2024/5/28 15:42
 */
public class Singleton {
    private static Singleton instance;
    private Singleton (){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
