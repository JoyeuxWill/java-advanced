package com.soft1841.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("服务器启动，端口号： " + serverSocket.getLocalPort());
        while (true){
            Socket socket = serverSocket.accept();
            ServerThread serverThread = new ServerThread();
            serverThread.setSocket(socket);
            new Thread(serverThread).start();
        }
    }
}

class ServerThread implements Runnable{
    private Socket socket;

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("客户端"+socket.getInetAddress()+"连接成功！");
    }
}