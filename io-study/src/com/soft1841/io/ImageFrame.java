package com.soft1841.io;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.sql.Time;
import java.time.LocalTime;

public class ImageFrame extends JFrame {
    private JPanel topPanel;
    private JPanel buttomPanel;
    private JButton[] buttons;
    private JLabel imgLabel;
    private Icon icon;


    public ImageFrame(){
        init();
        setTitle("图片窗体");
        setSize(1000,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    //设置布局，放置组件
    public void init(){
        topPanel = new JPanel();
        buttons = new  JButton[5];
        for (int i = 0;i<5;i++){
            buttons[i]  = new JButton("按钮" + i + 1);
            topPanel.add(buttons[i]);
        }
        add(topPanel, BorderLayout.NORTH);
        imgLabel = new JLabel("图片");
        //读入本地图片到内存的字节数组
        File srcFile = new File("D:/1.jpg");
        InputStream inputStream;
        byte[] bytes = null;
        try {
            inputStream = new FileInputStream(srcFile);
            bytes = new byte[(int) srcFile.length()];
            inputStream.read(bytes);
        } catch (IOException e) {
            System.out.println("IO异常");
        }
        icon = new ImageIcon(bytes);
        imgLabel.setIcon(icon);
        JLabel nameLabel = new JLabel("图片名称");
        LocalTime time = LocalTime.now();
        nameLabel.setText(srcFile.getAbsolutePath() + "       " + time);
        add(imgLabel,BorderLayout.CENTER);
        add(nameLabel,BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        new ImageFrame();
    }
}
