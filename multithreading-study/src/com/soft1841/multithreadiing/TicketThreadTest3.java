package com.soft1841.multithreadiing;

/**
 * 多线程售票程序
 * 使用线程同步的方式实现
 *
 * @author Jiayue
 * 2019.4.9
 */
public class TicketThreadTest3 {
    public static void main(String[] args) {
        TicketThread3 tt = new TicketThread3();
        Thread thread1 = new Thread(tt, "南工院");
        thread1.start();
        Thread thread2 = new Thread(tt, "南信院");
        thread2.start();
        Thread thread3 = new Thread(tt, "南铁院");
        thread3.start();

    }
}

class TicketThread3 implements Runnable {
    private int tickets = 10;

    @Override
    public void run() {
        while (tickets > 0) {
            //同步售票代码块
            synchronized (this) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("中断异常!");
                    }
                    System.out.println(Thread.currentThread().getName() + "售票，当前票数" + --tickets);
                } else {
                    break;
                }
            }
        }
    }
}