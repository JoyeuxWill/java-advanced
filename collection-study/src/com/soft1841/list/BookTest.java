package com.soft1841.list;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"毛泽东语录",12.6));
        books.add(new Book(2,"宪法",100.2));
        books.add(new Book(3,"Java从入门到入坟",777.7));
        books.add(new Book(4,"高数",66.6));
        System.out.println(books);
        books.add(new Book(5,"金瓶梅",23.4));
        System.out.println(books);
        books.remove(new Book(2,"宪法",100.2));
        System.out.println(books);
        books.set(3,new Book(6,"毛泽东语录",42.6));
        System.out.println(books);
        System.out.println(books.get(3));
        books.add(new Book(7,"HTML",1.1));
        System.out.println(books);
        System.out.println(books.indexOf(new Book(5,"金瓶梅",23.4)));
        System.out.println(books.lastIndexOf(new Book(5,"金瓶梅",23.4)));
    }
}
