package com.example.springCloudAlibaba.demo.structuredemo;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/4 12:43
 */
public class girl extends female {
    String nn;
    public girl(){
        System.out.println("girl的无参构造方法 ");
    }
    public girl(String n){
        System.out.println("（有参数）girl的的构造方法 ");
        this.nn = nn;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        System.out.println("测试一：");
//        new girl();
//        System.out.println("测试二：");
//        new female("tg");
//        new girl("tg");
//        System.out.println("测试三：");
//        new girl("tg");
//        new female("tg");
        System.out.println("测试四：");
        new girl("tg");
//        System.out.println("测试五：");
//        new female("tg");
    }
}
