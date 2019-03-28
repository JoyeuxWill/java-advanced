package com.soft1841.Swing;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private JLabel accoutLabel, passwordLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton comfirmButton;
    private JLabel bgLabel;

    public LoginFrame() {
        init();
        setTitle("登陆窗体");
        setSize(640, 480);
        setLocationRelativeTo(null);
        //窗口大小不可变
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void init() {
        Font font = new Font("微软雅黑", Font.PLAIN, 18);
        accoutLabel = new JLabel("账号");
        accoutLabel.setFont(font);
        accountField = new JTextField();
        accountField.setFont(font);
        passwordLabel = new JLabel("密码");
        passwordLabel.setFont(font);
        passwordField = new JPasswordField();
        passwordField.setFont(font);
        comfirmButton = new JButton("登陆");
        comfirmButton.setFont(font);
        //窗口布局设为空布局，需要给每个组件定位
        setLayout(null);
        //setBounds 方法的四个参数分别为组件x、y坐标，组件宽高
        accoutLabel.setBounds(120, 100, 100, 35);
        accountField.setBounds(250, 100, 300, 35);
        passwordLabel.setBounds(120, 180, 100, 35);
        passwordField.setBounds(250, 180, 300, 35);
        comfirmButton.setBounds(100, 300, 450, 50);
        comfirmButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.blue));
        add(accoutLabel);
        add(accountField);
        add(passwordLabel);
        add(passwordField);
        add(comfirmButton);
        bgLabel = new JLabel();
        Icon bgicon = new ImageIcon(LoginFrame.class.getResource("/img/bg.jpg"));
        bgLabel.setIcon(bgicon);
        bgLabel.setBounds(0, 0, 640, 480);
        add(bgLabel);


    }

    public static void main(String[] args) {
        //用beautyeye样式
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new LoginFrame();
    }
}

