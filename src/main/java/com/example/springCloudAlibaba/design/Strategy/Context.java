package com.example.springCloudAlibaba.design.Strategy;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/28 16:25
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
