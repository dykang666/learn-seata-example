package com.example.springCloudAlibaba.design.single.lazy;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/28 15:44
 */
public class SingletonSafe {
    private static SingletonSafe instance;
    private SingletonSafe (){}
    public static synchronized SingletonSafe getInstance() {
        if (instance == null) {
            instance = new SingletonSafe();
        }
        return instance;
    }
}
