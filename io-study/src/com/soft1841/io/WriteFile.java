package com.soft1841.io;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要写入的内容:");
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        File srcFile = new File("D:/hello.txt");
        Writer out = new FileWriter(srcFile);
        out.write(chars);
        out.close();

    }
}
