package com.soft1841.multithreadiing;

public class Team {
    public static void main(String[] args) {
        TeamA a = new TeamA();
        a.start();
        TeamB b = new TeamB();
        b.start();
    }
}
class TeamA extends Thread {
    @Override
    public void run() {
        for (int i = 0;i < 11;i ++){
            System.out.print("A" + i + "  ");
        }
    }
}

class TeamB extends Thread{
    @Override
    public void run() {
        for (int j = 0;j < 11;j ++){
            System.out.print("B" + j + "  ");
        }
    }
}
