package com.example.springCloudAlibaba.design.single;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/28 15:39
 */
public class SingleObject {
    //创建 SingleObject 的一个对象  饿汉式
    private static SingleObject instance = new SingleObject();
    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}
    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }



}
