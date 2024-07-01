package Patterns.Visitor;

public interface Visitor {

  public double visit(Shirt shirtItem);
  public double visit(TShirt tShirtItem);
  public double visit(Jacket jacketItem);

}
