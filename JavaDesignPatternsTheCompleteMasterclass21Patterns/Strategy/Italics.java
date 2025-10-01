package Patterns.Strategy;

public class Italics implements Font {

  @Override
  public void write(String text) {
    System.out.println("Text in Italics: " + text);
  }

}
