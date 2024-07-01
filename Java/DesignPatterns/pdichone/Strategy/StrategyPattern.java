package Patterns.Strategy;

public class StrategyPattern {

  public void runStrategyPattern(){

    Document doc = new Document();

    Line firstLine = new Line("This is the first line");
    Line secondLine = new Line("This is the second line");
    Line thirdLine = new Line("This is the third line");
    Line forthLine = new Line("This is the forth line");

    doc.addLine(firstLine);
    doc.addLine(secondLine);
    doc.addLine(thirdLine);
    doc.addLine(forthLine);

    doc.write(new Bold());

    doc.removeLine(firstLine);
    doc.removeLine(secondLine);

    doc.write(new Italics());

  }

}
