package com.soft1841.design_study.decoratorpattern;

import java.util.Calendar;

public class TimerLoggerDecorator implements Logger {
    private  Logger decoratorLoger;

    public TimerLoggerDecorator(Logger decoratorLoger){
        this.decoratorLoger = decoratorLoger;
    }
    @Override
    public void log(String message) {
        decoratorLoger.log(message);
        logTime();
    }
    public void logTime(){
        System.out.println(Calendar.getInstance().getTime());
    }
}
