package com.soft1841.multithreadiing.exercise1;



import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Frame extends JFrame implements ActionListener {
    private JButton chooseBtn, preBtn, nextBtn;
    private JPanel centerPanel, topPanel, leftPanel, bottomPanel;
    private CardLayout cardLayout;
    private JLabel carouselLabel, imgLabel;
    private JFileChooser fileChooser;


    public Frame() {
        init();
        setTitle("窗口");
        setSize(1920, 1080);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }


    public void init() {
        Font font = new Font("方正克书皇榜体 简", Font.PLAIN, 30);
        chooseBtn = new JButton("选择");
        preBtn = new JButton("前一张");
        nextBtn = new JButton("后一张");
        chooseBtn.setFont(font);
        imgLabel = new JLabel();
        centerPanel = new JPanel();
        topPanel = new JPanel();
        leftPanel = new JPanel();
        bottomPanel = new JPanel();
        cardLayout = new CardLayout();
        carouselLabel = new JLabel();
        cardLayout = new CardLayout();
        centerPanel.add(carouselLabel);
        bottomPanel.add(nextBtn);
        bottomPanel.add(preBtn);
        preBtn.addActionListener(this);
        nextBtn.addActionListener(this);
        chooseBtn.addActionListener(this);
        leftPanel.setLayout(cardLayout);
        leftPanel.setBackground(new Color(238, 238, 238));
        CarouselThread carouselThread = new CarouselThread();
        carouselThread.setCarouselLabel(carouselLabel);
        new Thread(carouselThread).start();
        topPanel.add(chooseBtn);
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(leftPanel, BorderLayout.WEST);
        add(bottomPanel,BorderLayout.SOUTH);
    }



    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.
                    BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Frame();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooseBtn) {
            fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("D:/img"));
            fileChooser.setMultiSelectionEnabled(true);
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File[] files = fileChooser.getSelectedFiles();
                for (File f : files) {
                    System.out.println(f.getAbsolutePath());
                    try {
                        byte[] bytes = new byte[(int) f.length()];
                        InputStream inputStream = new FileInputStream(f);
                        inputStream.read(bytes);
                        Icon icon = new ImageIcon(bytes);
                        JLabel imageLabel = new JLabel();
                        imageLabel.setIcon(icon);
                        leftPanel.add(imageLabel);
                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null, "IO异常");
                    }
                }
            }
        }
        if (e.getSource() == nextBtn) {
            cardLayout.next(leftPanel);
        }
        if (e.getSource() == preBtn) {
            cardLayout.previous(leftPanel);
        }
    }
}

