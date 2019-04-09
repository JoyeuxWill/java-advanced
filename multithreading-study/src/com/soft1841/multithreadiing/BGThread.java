package com.soft1841.multithreadiing;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BGThread extends Thread {
    private JPanel backPanel;

    public void setBackPanel(JPanel backPanel){
        this.backPanel = backPanel;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int redRan = random.nextInt(256);
            int greedRan = random.nextInt(256);
            int blueRan = random.nextInt(256);
            backPanel.setBackground(new Color(redRan, greedRan, blueRan));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
