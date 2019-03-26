package com.soft1841.io;

import java.io.*;

public class TxtCopy {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:/hello666.txt");
        if (srcFile.exists()){
            File destFile = new File("D:/hellocopy.txt");
            Reader in = new FileReader(srcFile);
            char[] chars = new char[(int) srcFile.length()];
            in.read(chars);
            Writer out = new FileWriter(destFile);
            out.write(chars);
            in.close();
            out.close();
        }else {
            System.out.println("文件不存在！");
        }

    }
}
