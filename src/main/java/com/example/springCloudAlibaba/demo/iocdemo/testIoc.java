package com.example.springCloudAlibaba.demo.iocdemo;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/15 16:47
 */
public class testIoc {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Fruit f=Factory.getInstance("com.example.springbootdemo3.spidemo.iocdemo.Apple");
        if(f!=null){
            f.eat();
        }
    }
}
