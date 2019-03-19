package com.soft1841.list;

import java.util.ArrayList;
import java.util.List;

public class StarTest {
    public static void main(String[] args) {
        List<NBAStar> nbaStars = new ArrayList<>();
        nbaStars.add(new NBAStar("乔丹", "飞人/神", 30.1, 6.2, 5.3));
        System.out.println("--------------NBA巨星-------------");
        nbaStars.forEach(star-> System.out.println(star.getName()+"  "
                + star.getNickname()+"  "
                + star.getPoint()+"  "
                + star.getRebound()+"  "
                + star.getAssist()+"  "));
    }
}
