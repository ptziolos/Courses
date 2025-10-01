import java.io.*;

public class CharacterStream {

  public static void main(String [] args)
  {
    try
    {
      OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("example4.txt"));
//      OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("example4.txt"), "ASCII");
      InputStreamReader in = new InputStreamReader(new FileInputStream("example4.txt"));

      System.out.println(out.getEncoding());

      out.write("Hello CharacterStream!");

      out.flush();

      out.write("another string");

      out.flush();
      out.close();

      int data = in.read();
      while(data != -1)
      {
        System.out.print((char)data);
        data = in.read();
      }

    }
    catch(Exception e)
    {
      System.err.println(e.toString());
    }
  }
}