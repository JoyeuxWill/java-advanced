package com.soft1841.io;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class PictureReaderFrame extends JFrame implements ActionListener{
    private JTextField inputField;
    private JButton confirmButton;
    private JPanel topPanel;
    private JLabel imgLabel;
    private Icon icon;

    public PictureReaderFrame(){
        init();
        setTitle("图片阅读器");
        setSize(new Dimension(1920,1080));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init(){
        imgLabel = new JLabel();
        Font font = new Font("微软雅黑",Font.PLAIN,24);
        inputField = new JTextField(20);
        inputField.setFont(font);
        inputField.setSize(new Dimension(970,40));
        confirmButton = new JButton("确认");
        confirmButton.setPreferredSize(new Dimension(90,40));
        topPanel = new JPanel();
        topPanel.setSize(new Dimension(600,50));
        topPanel.add(inputField);
        topPanel.add(confirmButton);
        confirmButton.addActionListener(this);
        add(topPanel,BorderLayout.NORTH);
        imgLabel = new JLabel();
        add(imgLabel,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new PictureReaderFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = inputField.getText().trim();
        File srcFile = new File(str);
        InputStream inputStream;
        byte[] bytes = null;
        try {
            inputStream = new FileInputStream(srcFile);
            bytes = new byte[(int) srcFile.length()];
            inputStream.read(bytes);
        } catch (IOException e1) {
            JOptionPane.showConfirmDialog(null,"IO异常","异常",JOptionPane.ERROR_MESSAGE);
        }
        icon = new ImageIcon(bytes);
        imgLabel.setIcon(icon);
    }
}


