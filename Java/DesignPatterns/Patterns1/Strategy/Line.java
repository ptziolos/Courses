package Patterns.Strategy;

public class Line {

  private String letters;

  public Line(String someLetters){
    this.letters = someLetters;
  }

  public String getText(){
    return this.letters;
  }

}
