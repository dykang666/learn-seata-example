package com.example.springCloudAlibaba.design.factory.reflect.demo2;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 14:37
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        calcul(23, 43, "Sub");
    }
    public static void calcul(double arg0,double arg1,String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        double result = 0;
        Class<?> clazz = Class.forName("com.example.springbootdemo3.design.factory.reflect.demo2." + type);
        Calcul cal = (Calcul)clazz.newInstance();
        result = cal.getResult(arg0, arg1);
        System.out.println(result);
    }
}
