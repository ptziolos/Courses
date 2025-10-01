import java.io.*;

public class IntStream {

  public static void main(String[] args) {
    // TODO code application logic here
    try
    {
      FileInputStream inputStream = new FileInputStream("example1.txt");

      int data = inputStream.read();

      while(data != -1)
      {
        System.out.print((char)data);

        data = inputStream.read();
      }

      inputStream.close();
    }
    catch(Exception e)
    {
      System.out.println(e.toString());
    }
  }

}