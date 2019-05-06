package com.soft1841.network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("服务器启动");
        OutputStream out;
        String info = "Java Socket Study~~";
        while (true){
            Socket socket = serverSocket.accept();
            System.out.println(socket.getInetAddress() + "上线了");
            out = socket.getOutputStream();
            out.write(info.getBytes());
            out.close();
            socket.close();
        }
    }
}
