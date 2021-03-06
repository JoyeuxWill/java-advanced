package com.soft1841.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 遍历文件夹
 * @author Jiayue
 * 2019.4.1
 */
public class FileTest {
    public static void main(String[] args) {
        // 遍历文件
        String path = "C:/Users/DELL/Pictures/Saved Pictures";
        File file = new File(path);
        if (file.exists() ) {
            List<File> fs = new ArrayList<>();
            getAllFile(file, fs);
            System.out.println("文件夹下的图片有：");
            for (File f : fs) {
                System.out.println(f.getName());
            }
        }
    }
    private static void getAllFile(File mFile, List<File> f) {
        // 获取子目录
        File[] files = mFile.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file, f);
            } else {
                String fileName = file.getName();
                if (fileName.endsWith(".jpg") || (fileName.endsWith(".png"))) {
                    f.add(file);
                }
            }
        }
    }
}
