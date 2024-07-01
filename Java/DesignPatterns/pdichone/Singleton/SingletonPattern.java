package Patterns.Singleton;

public class SingletonPattern {

  public void runSingletonPattern(){

    Singleton firstInstance = Singleton.getInstance();
    Singleton secondInstance = Singleton.getInstance();

    System.out.println("First Instance: " + firstInstance);
    System.out.println("Second Instance: " + secondInstance);

  }

}
