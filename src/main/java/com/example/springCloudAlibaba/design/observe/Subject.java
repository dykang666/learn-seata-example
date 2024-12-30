package com.example.springCloudAlibaba.design.observe;

import java.util.ArrayList;
import java.util.List;


/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/28 15:28
 */
public class Subject {
    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
