package com.soft1841.multithreadiing;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetImageByNet {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554778070287&di=af3f46b307695ee5bf0a84d75d0c673b&imgtype=0&src=http%3A%2F%2Fimg1.ph.126.net%2FSSvFbcJzwGBlqy4xon6FjA%3D%3D%2F6608832342050415367.jpg");
        //打开链接
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        //设置请求方式为GET
        conn.setRequestMethod("GET");
        //超时响应时间为5s
        conn.setConnectTimeout(5*1000);
        //通过输入流获取图片数据
        InputStream inStream =conn.getInputStream();
        //得到图片的二进制数据，以二进制封装得到数据，具有通用性
        ByteArrayOutputStream out1 = new ByteArrayOutputStream();
        //准备缓冲字节数据
        byte[] buffer = new byte[1024];
        int len = 0;
        //每次读入一个缓冲区大小的字节数
        while ((len = inStream.read(buffer)) != -1){
            out1.write(buffer,0,len);
        }
        inStream.close();
        //通过输出流获取到字节数组
        byte[] data = out1.toByteArray();
        //new一个文件对象用来保存图片，默认保存当前工程根目录
        File imageFile = new File("test.jpg");
        //创建输出流
        OutputStream out2 = new FileOutputStream(imageFile);
        //写入数据
        out2.write(data);
        out2.close();

    }
}
