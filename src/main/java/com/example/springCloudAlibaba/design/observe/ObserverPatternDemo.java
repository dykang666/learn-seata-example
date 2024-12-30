package com.example.springCloudAlibaba.design.observe;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 观察者模式
 * @date 2024/5/28 15:31
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
       // System.out.println("Second state change: 10");
      //  subject.setState(10);
    }
}
