package com.soft1841;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * 随机颜色练习
 * @author Jiayue
 * 2019.3.12
 */
public class RandomColor {
    public static void main(String[] args)throws IOException {
        Random random = new Random();
        //生成redRandom随机值
        int redRandom = random.nextInt(256);
        //生成greenRandom随机值
        int greenRandom = random.nextInt(256);
        //生成blueRandom随机值
        int blueRandom = random.nextInt(256);
        System.out.println("R:" + redRandom  + ",G:" + greenRandom + ",B:" + blueRandom);
        //开始使用随机数值绘制图片
        //在图片缓冲区生成一个图片对象.指定图片大小和类型
        BufferedImage bufferedImage = new BufferedImage(
                120,
                40,
                BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics g = bufferedImage.getGraphics();
        //设置字体
        Font font = new Font("方正克书皇榜体 简",Font.BOLD,26);
        g.setFont(font);
        //设置画笔颜色
        Color color = new Color(redRandom,greenRandom,blueRandom);
        g.setColor(color);
        //开始绘制矩形，充满图片缓冲区
        g.fillRect(0,0,120,40);
        //绘制文字
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        char[] chs= s.toCharArray();
        String string = new String();
        for(int i = 0; i <4 ; i++) {
            char ch = chs[random.nextInt(60)];
            string = string + ch;
        }
        g.setColor(Color.BLACK);
        g.drawString(string,40,28);
        //输出图片,并指定文件路径
        File file = new File("D:/code.jpg");
        //获取输出流
        OutputStream outputStream =new FileOutputStream(file);
        //将图片从缓冲区通过字节写到文件
        ImageIO.write(bufferedImage,"jpg",outputStream);
        //关闭输出流
        outputStream.close();
    }
}
