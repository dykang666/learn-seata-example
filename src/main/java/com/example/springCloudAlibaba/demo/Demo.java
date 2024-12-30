package com.example.springCloudAlibaba.demo;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/5 18:41
 */
public class Demo {
    public static void main(String[] args) {
        double v = 3 * 0.1;
        if("2".equals("1")){}
        System.out.println(v);
        System.out.println(3*0.1 == 0.3);
    }

    private static <T extends Number> double add(T a, T b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }
}
