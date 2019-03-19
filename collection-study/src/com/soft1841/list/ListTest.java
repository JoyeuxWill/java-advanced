package com.soft1841.list;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List接口的基础练习
 * @author Jiayue
 * 2019.3.19
 */
public class ListTest {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        //通过循环遍历输出
        for (int i = 0,len = list.size();i  < len;i ++){
            System.out.println(list.get(i));
        }
        //通过Iterator迭代器输出
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //使用lambda表达式遍历集合
        list.forEach(s -> System.out.println(s));

    }
}
