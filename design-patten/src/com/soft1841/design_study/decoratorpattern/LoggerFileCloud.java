package com.soft1841.design_study.decoratorpattern;

public class LoggerFileCloud implements Logger{
    @Override
    public void log(String message) {
        System.out.println("日志输出到云平台" + message);
    }
}
