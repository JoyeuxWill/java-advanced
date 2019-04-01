package com.soft1841.io;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * txt文件阅读器窗体
 *
 */
public class TextReaderFrame extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton confirmButton;
    private JPanel topPanel;
    private JTextArea contentArea;


    public TextReaderFrame(){
        init();
        setTitle("文本窗体阅读器");
        setSize(new Dimension(1920,1080));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public void init(){
        inputField = new JTextField();
        inputField.setPreferredSize(new Dimension(860,45));
        confirmButton = new JButton("确认");
        confirmButton.setPreferredSize(new Dimension(150,40));
        topPanel = new JPanel();
        topPanel.add(inputField);
        topPanel.add(confirmButton);
        //给按钮注册监听
        confirmButton.addActionListener(this);
        add(topPanel,BorderLayout.NORTH);
        contentArea = new JTextArea();
        add(contentArea,BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new TextReaderFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取输入框内容
        String filePath = inputField.getText().trim();
        File file = new File(filePath);
        //使用三种方法将file中的内容读入
        try {
            InputStream inputStream = new FileInputStream(file);
            byte[] bytes  = new byte[(int) file.length()];
            inputStream.read(bytes);
            //使用bytes构建一个新的输出字符串
            String resultStr = new String(bytes);
            contentArea.append(resultStr);
            //追加一次回车换行
            contentArea.append("\n\r");
        } catch (IOException e1) {
            JOptionPane.showConfirmDialog(null,"IO操作异常");
        }
    }
}
