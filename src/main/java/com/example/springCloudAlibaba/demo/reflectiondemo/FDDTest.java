package com.example.springCloudAlibaba.demo.reflectiondemo;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/3 15:15
 */
public class FDDTest {
    public static void main(String[] args) {
        //注意，我在com.fdd.reflect包下建的类
        String user = "com.example.springbootdemo3.spidemo.reflectiondemo.User";
        test(user);
    }

    public  static   void test(String user) {
        try {
            Class<?> aClass = ClassLoader.getSystemClassLoader().loadClass(user);
            //Class<?> loaderUser = loader.loadClass(user);
            System.out.println("user " + aClass.getName());
            System.out.println("---------------------------------------");
//            Class forNameUser = Class.forName(user);
//            System.out.println("Class.forName testing...");
//            System.out.println("user " + forNameUser.getName());

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
