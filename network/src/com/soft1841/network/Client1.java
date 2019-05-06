package com.soft1841.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.40.148.0",1912);
        InputStream in = socket.getInputStream();
        byte[] b = new byte[1024];
        in.read();
        System.out.println("服务器端发送的内容为：" + new String(b));
        in.close();
        socket.close();
    }
}
