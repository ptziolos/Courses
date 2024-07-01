package Patterns.Strategy;

public class Bold implements Font{

  @Override
  public void write(String text) {
    System.out.println("Text in Bold: " + text);
  }

}
