package com.soft1841.design_study.decoratorpattern;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = new TimerLoggerDecorator(new LoggerFileSystem());
        logger1.log("登录系统。。。");
        Logger logger2 = new TimerLoggerDecorator(new LoggerFileCloud());
        logger2.log("登录系统。。。");
    }
}
