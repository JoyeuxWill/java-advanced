package com.soft1841.io;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class JFileChooserTest extends JFrame implements ActionListener {
    private JButton chooseButton;
    private JLabel pathLabel;
    private JFileChooser fileChooser;



    public JFileChooserTest(){
        init();
        setTitle("JFileChooserTest");
        setSize(new Dimension(1920,1080));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }
    private void init(){
        chooseButton = new JButton("选择文件");
        pathLabel  = new JLabel("暂无选择");
        add(chooseButton,BorderLayout.NORTH);
        chooseButton.addActionListener(this);
        Font font = new Font("微软雅黑",Font.BOLD,28);
        pathLabel.setFont(font);
        add(pathLabel);

    }


    public static void main(String[] args) {
        new JFileChooserTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //创建一个JFileChooser对象
        fileChooser = new JFileChooser();
        //设置文件选择器的默认路径
        fileChooser.setCurrentDirectory(new File("D:\\"));
        //设置用户点击“确认按钮”按钮
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            try {
                InputStream inputStream = new FileInputStream(file);

            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }

    }
}
