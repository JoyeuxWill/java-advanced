package com.soft1841.io;

import java.io.*;
import java.util.UUID;

public class PictureCopy {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:/1.jpg");
        String srcFileName = srcFile.getName();
        int position = srcFileName.indexOf(".");
        String suffixName = srcFileName.substring(position + 1);
        String newName = UUID.randomUUID().toString();
        File tarFile = new File("D:/私人文件/" + newName + "." + suffixName);
        byte[] bytes = new byte[(int) srcFile.length()];
        InputStream inputStream = new FileInputStream(srcFile);
        inputStream.read(bytes);
        OutputStream outputStream = new FileOutputStream(tarFile);
        outputStream.write(bytes);
        inputStream.close();
        outputStream.close();
    }
}
