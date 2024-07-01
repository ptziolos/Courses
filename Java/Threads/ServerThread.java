public class ServerThread extends Thread
{
  public ServerThread(String threadName)
  {
    this.setName(threadName);
  }

  public void run()
  {
    try
    {
      int clientNumber = 1;
      while(clientNumber != 100)
      {
        System.out.println(this.getName() + " sent data to client: " + clientNumber);
        Thread.sleep(1000);
        clientNumber++;
      }
    }
    catch(InterruptedException e)
    {
      System.out.println(e.toString());
    }
  }
}