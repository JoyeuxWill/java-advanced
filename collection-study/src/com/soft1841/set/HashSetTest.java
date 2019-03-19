package com.soft1841.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println(set);
//        String s1 = new String("A");
//        String s2 = new String("B");
//        String s3 = new String("C");
//        String s4 = new String("A");
//        set.add(s1);
//        set.add(s2);
//        set.add(s3);
//        set.add(s4);
//        System.out.println(set);
        //用循环遍历set集合
        System.out.println("用循环遍历set集合:");
        Object[] array = set.toArray();
        for (int i = 0,len = array.length;i < len;i ++){
            System.out.print(array[i] + "  ");
        }
        //用itretor迭代器遍历集合
        System.out.println("");
        System.out.println("用itretor迭代器遍历集合:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "   ");
        }
        //用lambda表达式遍历集合
        System.out.println("");
        System.out.println("用lambda表达式遍历集合:");
        set.forEach(s -> System.out.print(s));
    }
}
