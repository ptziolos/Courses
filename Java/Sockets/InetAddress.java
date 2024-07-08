import java.io.*;
import java.net.*;


public class InetAddress {
  public static void main(String [] args) {
    try {
      InetAddress address = InetAddress.getLocalHost();
      System.out.println(address.getHostAddress());
      System.out.println(address.getHostName());
      InetAddress address2 = InetAddress.getByName("google.com");
      System.out.println(address2.getHostAddress());
      System.out.println(address2.getHostName());
    }
    catch(IOException e) {
      System.out.println(e.toString());
    }
  }
}