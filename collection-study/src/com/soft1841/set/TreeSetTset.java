package com.soft1841.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTset {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(2123);
        set.add(666);
        Iterator<Integer> iterator = set.iterator();
        System.out.println("集合中的元素有：");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "     ");
        }



    }
    //TreeSet可以自动排序
}
