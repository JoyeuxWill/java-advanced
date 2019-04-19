package com.soft1841.multithreadiing.jsoup;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * JSoup爬虫练习1
 * @author Jiayue
 * 2019-04-18
 */

public class JSoupDemo1 {
    public static void main(String[] args) throws Exception {
        //1.指定目标链接
        String url = "https://www.bilibili.com/";
        //2.建立与目标页面的链接
        Connection connection = Jsoup.connect(url);
        //3.解析目标页面
        Document document =connection.get();
        //获取页面中所有的class为groom-module home-card的元素 检查元素
        Elements elements = document.getElementsByClass("groom-module home-card");
        System.out.println(elements.size());
        for (Element element:elements) {
            //去除div的子元素
            Element link  =element.child(0);
            //得到a标记的文字内容
            String titleString = link.text();
            System.out.println(titleString);

        }
    }
}
