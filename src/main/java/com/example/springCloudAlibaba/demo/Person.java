package com.example.springCloudAlibaba.demo;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/4 11:40
 */
public class Person {
    {
        System.out.println("Person-->实例初始化块");
    }

    public Person() {
        System.out.println("Person-->构造器");
    }
}
class Student extends Person {

    {
        System.out.println("Student-->实例初始化块");
    }

    public Student() {
        System.out.println("Student-->构造器");
    }

    public static void main(String[] args) {
        new Student();
    }
}
