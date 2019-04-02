package com.soft1841.Swing;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;

/**
 * 使用卡片布局实现多图浏览功能
 */
public class ImageViewerFrame extends JFrame implements ActionListener {
    private JButton chooseBtn,preBtn,nextBtn;
    private JFileChooser fileChooser;
    private JPanel centerPanel,bottomPanel;
    private CardLayout cardLayout;



    public ImageViewerFrame(){
        init();
        setTitle("使用卡片布局实现多图浏览功能");
        setSize(new Dimension(1920,1080));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }


    private void init(){
        bottomPanel = new JPanel();
        preBtn = new JButton("前一张");
        nextBtn = new JButton("后一张");
        chooseBtn = new JButton("选择图片");
        bottomPanel.add(nextBtn);
        bottomPanel.add(preBtn);
        preBtn.addActionListener(this);
        nextBtn.addActionListener(this);
        chooseBtn.addActionListener(this);
        add(chooseBtn,BorderLayout.NORTH);
        add(bottomPanel,BorderLayout.SOUTH);
        centerPanel  = new JPanel();
        cardLayout = new CardLayout();
        centerPanel.setLayout(cardLayout);
        centerPanel.setBackground(new Color(40,40,40));
        add(centerPanel);


    }


    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.
                    BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new ImageViewerFrame();
    }




        @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooseBtn){
            fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("D:/Saved Pictures"));
            fileChooser.setMultiSelectionEnabled(true);
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                //获取选中的所有文件
                 File[] files = fileChooser.getSelectedFiles();
                //遍历文件数组
                for (File f:files) {
                    System.out.println(f.getAbsolutePath());
                    try {
                        byte[] bytes = new byte[(int) f.length()];
                        InputStream inputStream = new FileInputStream(f);
                        inputStream.read(bytes);
                        Icon icon = new ImageIcon(bytes);
                        JLabel imageLabel = new JLabel();
                        imageLabel.setIcon(icon);
                        centerPanel.add(imageLabel);
                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null,"IO异常");
                    }
                }
            }
        }
        if (e.getSource() == nextBtn){
            cardLayout.next(centerPanel);
        }
        if (e.getSource() == preBtn){
            cardLayout.previous(centerPanel);
        }
    }
}
