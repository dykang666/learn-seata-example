package com.example.springCloudAlibaba.demo.iocdemo;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/15 16:47
 */
public class Factory {
    public static Fruit getInstance(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Fruit f=null;
        f = (Fruit) Class.forName(className).newInstance();
        return f;
    }
}
