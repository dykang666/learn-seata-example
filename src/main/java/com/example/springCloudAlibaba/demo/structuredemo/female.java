package com.example.springCloudAlibaba.demo.structuredemo;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/4 12:42
 */
public class female {
    String n;
    public female(){
        System.out.println("female的无参构造方法 ");
    }

    public female(String n){
        System.out.println("（有参数）female的的构造方法 ");
        this.n = n;
    }


}
