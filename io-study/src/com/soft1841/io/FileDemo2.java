package com.soft1841.io;

import java.io.File;
import java.nio.file.Path;

public class FileDemo2 {
    public static void main(String[] args) {
        String[] strings = {"图片","视频","文档"};
        for (int i = 0;i < strings.length; i++){
            File path  = new File("D:/upload/" + strings[i]);
            if (!path.exists());
            path.mkdirs();
        }
    }
}
