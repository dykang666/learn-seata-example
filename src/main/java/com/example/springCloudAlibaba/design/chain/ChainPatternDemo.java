package com.example.springCloudAlibaba.design.chain;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * 解耦请求发送者和接收者，使多个对象都有可能接收请求，而发送者不需要知道哪个对象会处理它。
 * @date 2024/5/28 15:58
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
     //   loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");
//        loggerChain.logMessage(AbstractLogger.ERROR,
//                "This is an error information.");


    }
}
