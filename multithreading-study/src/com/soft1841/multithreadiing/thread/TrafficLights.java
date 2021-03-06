package com.soft1841.multithreadiing.thread;

import javax.swing.*;
import java.awt.*;

public class TrafficLights extends JFrame {
    JLabel lblImage;
    JPanel contentPane;

    public TrafficLights() {
        init();
        setTitle("红绿灯");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init() {
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        setContentPane(contentPane);
        JPanel imagePane = new JPanel();
        contentPane.add(imagePane);
        imagePane.setLayout(new BorderLayout(0, 0));
        lblImage = new JLabel("");
        lblImage.setBackground(Color.WHITE);
        lblImage.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/Green.png")));
        imagePane.add(lblImage, BorderLayout.CENTER);
        Thread thread = new Thread(new TurnColor(lblImage));
        thread.start();
    }

    public static void main(String[] args) {
        new TrafficLights();
    }
}

class TurnColor implements Runnable {
    private JLabel lblImage;

    public TurnColor(JLabel lblImage) {
        this.lblImage = lblImage;
    }


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lblImage.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/yellow.png")));
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lblImage.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/red.png")));
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lblImage.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/green.png")));
        }
    }
}
