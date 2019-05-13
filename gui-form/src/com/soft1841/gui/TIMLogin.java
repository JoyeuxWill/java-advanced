package com.soft1841.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TIMLogin {
    private JPanel mainPanel;
    private JLabel bannerLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel avatarLabel;
    private JCheckBox 记住密码CheckBox;
    private JCheckBox 自动登录CheckBox;
    private JButton loginBtn;

    public TIMLogin() {
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,"登录成功！");
            }
        });
    }

    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        JFrame frame = new JFrame("TIMLogin");
        frame.setContentPane(new TIMLogin().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(540,490);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
