package com.soft1841.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("郭瑞昌", 22));
        list.add(new Student("杨晶", 21));
        list.add(new Student("李家劲", 23));
        list.add(new Student("许源", 20));
        Collections.sort(list);
        for (Student student : list) {
            System.out.println("姓名:" + student.getName() + ",年龄：" + student.getAge());
        }
    }
}
