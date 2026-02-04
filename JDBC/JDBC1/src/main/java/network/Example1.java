package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Example1 {
    public static void main(String[] args) {
        try{
            InetAddress address=InetAddress.getLocalHost();
            System.out.println(address);

            InetAddress address1=InetAddress.getByName("www.cognizant.com");
            System.out.println(address1);
        }catch(UnknownHostException e){
            System.out.println(e.getMessage());
        }
    }
}
