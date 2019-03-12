package com.java.util;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        //生成5以内随机数
        Random random = new Random();
        int num = random.nextInt(6);
        System.out.println(num);
    }
}
