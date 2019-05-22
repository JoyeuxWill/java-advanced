package com.soft1841.design_study.adapterpattern;

public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("特长生招募中。。。");
        Student student1 = new Student() {
            @Override
            public void javaStudy() {
                System.out.println("我是一名练习两年半的练习生");
            }
        };
        student1.javaStudy();
        Student student2 = new Student() {
            @Override
            public void playBasketball() {
                System.out.print("我篮球打得好,");
            }

            @Override
            public void playFootball() {
                System.out.print("喜欢唱，跳，rap");
            }
        };
        student2.playBasketball();
        student2.playFootball();
    }
}
