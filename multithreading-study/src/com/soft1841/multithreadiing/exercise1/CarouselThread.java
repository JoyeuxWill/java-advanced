package com.soft1841.multithreadiing.exercise1;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CarouselThread implements Runnable{
    private String[] imgs = {"D:/img/1.gif", "D:/img/2.gif", "D:/img/3.gif", "D:/img/4.gif","D:/img/5.gif","D:/img/6.gif"};
    private JLabel CarouselLabel;

    public void setCarouselLabel(JLabel CarouselLabel) {

        this.CarouselLabel = CarouselLabel;

    }

    @Override
    public void run() {
        int i = 0;
        int len = imgs.length - 1;
        while (true) {
            try {
                File file = new File(imgs[i]);
                InputStream inputStream = new FileInputStream(file);
                byte[] bytes = new byte[(int) file.length()];
                inputStream.read(bytes);
                Icon icon = new ImageIcon(bytes);
                CarouselLabel.setIcon(icon);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                if (i == len) {
                    i = 0;
                }
            } catch (IOException e) {
                System.out.println("IO异常");
            }
        }
    }
}