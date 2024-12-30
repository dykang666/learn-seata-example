package com.example.springCloudAlibaba.design.chain;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/28 15:58
 */
public class FileLogger extends AbstractLogger{
    public FileLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
