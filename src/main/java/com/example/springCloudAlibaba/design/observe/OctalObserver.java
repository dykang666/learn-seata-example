package com.example.springCloudAlibaba.design.observe;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/28 15:30
 */
public class OctalObserver  extends Observer{
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
