package com.soft1841.design_study.proxypattern;

public class RealSubject implements Subject{
    @Override
    public void buyMac() {
        System.out.println("buy a mac");
    }
}
