import java.io.*;

public class OutStream {

  public static void main(String [] args)
  {
    try
    {
      FileOutputStream fileOutput = new FileOutputStream("example2.txt", false);

      char H = 'H';

      fileOutput.write((char)H);

      String string = "Hello OutputStream!";

      fileOutput.write(string.getBytes());

      fileOutput.close();


    }
    catch(Exception e)
    {
      System.out.println(e.toString());
    }
  }

}