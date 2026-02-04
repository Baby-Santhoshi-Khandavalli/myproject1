package network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(5000);
            System.out.println("Server running on 5000 port");
            System.out.println("Server waiting for connection");
            Socket accept=serverSocket.accept();

            DataOutputStream dataOutputStream=new DataOutputStream(accept.getOutputStream());

            System.out.println("Connected client address: "+accept.getInetAddress());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
