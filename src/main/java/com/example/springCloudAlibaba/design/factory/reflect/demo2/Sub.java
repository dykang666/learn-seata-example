package com.example.springCloudAlibaba.design.factory.reflect.demo2;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 14:36
 */
public class Sub implements Calcul{
    @Override
    public double getResult(double arg0, double arg1) {
        return arg0 - arg1;
    }
}
