package com.example.springCloudAlibaba.design.Strategy;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:  策略模式
 * 解决在多种相似算法存在时，使用条件语句（如if...else）导致的复杂性和难以维护的问题。
 * @date 2024/5/28 16:25
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
    }
}
