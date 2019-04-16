package com.soft1841.multithreadiing.thread;

import javax.swing.*;
import java.awt.*;

public class DrawLineFrame extends JFrame {
    public DrawLineFrame(){
        init();
        setTitle("绘制彩色线条");
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public  void init(){
        getContentPane().setBackground(new Color(240, 73, 8));
        DrawLineThread drawLineThread=new DrawLineThread();
        drawLineThread.setFrame(this);
        new Thread(drawLineThread).start();
    }
    public static void main (String[] args) {
        new DrawLineFrame();
    }
}

