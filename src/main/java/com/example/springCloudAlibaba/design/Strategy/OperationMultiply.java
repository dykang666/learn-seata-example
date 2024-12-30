package com.example.springCloudAlibaba.design.Strategy;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/28 16:24
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
