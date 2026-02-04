package network;

import java.io.IOException;

import java.net.Socket;

public class WebClient {
    public static void main(String[] args) {
        try{
            Socket socket=new Socket("local host",5000);
            System.out.println("Client running");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
