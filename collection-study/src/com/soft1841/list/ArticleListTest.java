package com.soft1841.list;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArticleListTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Article>articles = new ArrayList<>();
        articles.add(new Article(1,"这几个高质量的电子书网站，承包你一生的电子书资源","超逗的二哈少爷",sdf.parse("2019-03-18 19:36:22")));
        articles.add(new Article(2,"当我自律，一天24小时变成了48小时！","热情似火",sdf.parse("2019-03-18 20:36:22")));
        articles.add(new Article(3,"可怕的“人性实验”：生而为人，我劝你善良","精读君",sdf.parse("2019-01-18 19:36:22")));
        System.out.println("id    标题                    作者          时间");
        Iterator<Article>  iterator = articles.iterator();
        while (iterator.hasNext()){
            Article article = iterator.next();
            String result;
            result = timeCal(sdf.format(article.getWriteTime()));
            System.out.println(article.getId()+"  "+article.getTitle().substring(0,10)+"..."+
                    article.getAuthor()+"  "+result);
        }
    }
    private static String timeCal(String time) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1;
        long diff = 0;
        try {
            d1 = format.parse(time);
            Date now = new Date();
            diff = now.getTime() - d1.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long seconds = diff / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        if (seconds < 60) {
            return "刚刚";
        } else if (minutes < 60) {
            return minutes + "分钟前";
        } else if (hours < 24) {
            return hours + "小时前";
        } else {
            return days + "天前";
        }
    }

}
