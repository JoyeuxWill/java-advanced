package com.soft1841.gui;

import javax.swing.*;

public class CloudMusicFrame {
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JButton searchBtn;
    private JButton findBtn;
    private JButton MVButton;
    private JButton friendBtn;
    private JPanel centerPanel;
    private JLabel bottomLabel;
    private JLabel bannerLabel;
    private JPanel musicPanel;
    private JLabel music1Label;
    private JLabel music2Label;
    private JLabel music3Label;
    private JLabel music4Label;
    private JLabel music5Label;

    public static void main(String[] args) throws Exception{
        //根据系统设置按钮外观
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        JFrame frame = new JFrame("CloudMusicFrame");
        frame.setContentPane(new CloudMusicFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
