public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    ServerThread thread1 = new ServerThread("Server1");
    ServerThread thread2 = new ServerThread("Server2");
    thread2.setPriority(Thread.MAX_PRIORITY);
    System.out.println(thread2.getName() + "priority: " + thread2.getPriority());
    thread1.start();
    thread2.start();


    ImplementRunnable runnable1 = new ImplementRunnable(1);
    Thread thread3 = new Thread(runnable1);
    thread3.start();
    ImplementRunnable runnable2 = new ImplementRunnable(2);
    Thread thread4 = new Thread(runnable2, "Server2");
    thread4.start();
    ImplementRunnable runnable3 = new ImplementRunnable(3);
    runnable3.start();


  }

}