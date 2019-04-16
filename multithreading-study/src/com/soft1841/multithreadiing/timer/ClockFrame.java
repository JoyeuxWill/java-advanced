package com.soft1841.multithreadiing.timer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ClockFrame extends JFrame {
    private JPanel jPanel;
    private JLabel timeLabel;
    private TimerTask clockTask;
    private Timer timer;


    public ClockFrame() {
        init();
        setTitle("时钟");
        setSize(700, 500);
        setLocation(1220, 580);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void init() {
        jPanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                try {
                    Image bg = ImageIO.read(new File("D:/5.jpg"));
                    g.drawImage(bg, 0, 0, getWidth(), getHeight(), null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 150));
        add(jPanel);


        timeLabel = new JLabel();
        jPanel.add(timeLabel);
        timeLabel.setFont(new Font("方正克书皇榜体 简", Font.BOLD, 21));

        clockTask = new TimerTask() {
            @Override
            public void run() {
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String timeString = sdf.format(date);
                timeLabel.setText(timeString);
                if (timeString.equals("2019-04-16 09:32:15")) {
                    JOptionPane.showMessageDialog(jPanel, "时间到~~");
                }
            }
        };

        timer = new Timer();
        timer.schedule(clockTask, 10, 10);

    }

    public static void main(String[] args) {
        new ClockFrame();
    }
}
