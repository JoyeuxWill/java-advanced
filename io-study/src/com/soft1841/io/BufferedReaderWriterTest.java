package com.soft1841.io;

import java.io.*;

public class BufferedReaderWriterTest {
    public static void main(String[] args) {
        //定义字符串数组
        String content[] = {"像此刻的风，","骤然吹起。","我要抱着你,","坐在酒杯中。"};
        //创建文件对象
        File file = new File("word.txt");
        try {
            //创建FileWriter类对象
            FileWriter fw = new FileWriter(file);
            //创建BufferWriter类对象
            BufferedWriter bufw = new BufferedWriter(fw);
            //循环遍历数组
            for (int k = 0; k<content.length;k++){
                //将字符串数组中元素写入到磁盘文件中
                bufw.write(content[k]);
                //将数组中的单个元素以单行的形式写入文件
                bufw.newLine();
            }
            bufw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            //创建FileReader对象
            FileReader fr =  new FileReader(file);
            //创建BufferReader对象
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;
            int i = 0;
            //如果文件的文本行数不为null，则进入循环
            while ((s = bufr.readLine()) != null){
                i++;
                System.out.println("第" + i + "行：" +s);
            }
            bufr.close();
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
