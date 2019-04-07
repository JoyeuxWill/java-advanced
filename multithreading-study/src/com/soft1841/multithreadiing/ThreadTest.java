package com.soft1841.multithreadiing;

public class ThreadTest extends  Thread {
    private int count = 10;
    public void run() {
        while (true) {
            System.out.print(count + " ");
            if (--count == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        test.start();
    }

}
