package com.soft1841.exercise;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        //获取当前时间
        int year = calendar.get(Calendar.YEAR);
        //0表示1月
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println("当前时间是：" + year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);
        //calendar转date
        Date date = calendar.getTime();
        //获取毫秒数
        Long time = calendar.getTimeInMillis();
        System.out.println("当前时间：" + date);
        System.out.println("当前毫秒数：" + time);
    }
}
