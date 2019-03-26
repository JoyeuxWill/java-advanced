package com.soft1841.io;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String s1 = new String(year + "_" +month + "_" +day);
        File path =new File("D:/" + s1);
        if (!path.exists()){
            path.mkdirs();
        }
        String s2 =new String(hour + "_" + minute+ "_" + second);
        File file = new File(path + "/" + "hello  " + s2 + ".txt");
        //判断如果file不存在，则创建新文件
        if (!file.exists()){
            file.createNewFile();
        }
    }
}
