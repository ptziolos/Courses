package Patterns.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Document {

  List<Line> text;

  public Document(){
    this.text = new ArrayList<>();
  }

  public void addLine(Line line){
    this.text.add(line);
  }

  public void removeLine(Line line){
    this.text.remove(line);
  }

  public void write(Font font){
    for (Line line : this.text){
      font.write(line.getText());
    }
  }

}
