package com.example.springCloudAlibaba.demo.ClassLoader;

import java.sql.Driver;
import java.util.ServiceLoader;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/8 15:03
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        //loader.(null);
        ServiceLoader<Driver> loadedDrivers = ServiceLoader.load(Driver.class);
        System.out.println(loader);
        System.out.println(loader.getParent());
        System.out.println(loader.getParent().getParent());
    }
}
