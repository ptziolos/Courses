package Patterns.Visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor{

  @Override
  public double visit(Shirt shirtItem) {
    System.out.println("Shirt final price ith tax: ");
    return shirtItem.getPrice() * .10 + shirtItem.getPrice();
  }

  @Override
  public double visit(TShirt tShirtItem) {
    System.out.println("TShirt final price ith tax: ");
    return tShirtItem.getPrice() * .20 + tShirtItem.getPrice();
  }

  @Override
  public double visit(Jacket jacketItem) {
    System.out.println("Jacket final price ith tax: ");
    return jacketItem.getPrice() * .30 + jacketItem.getPrice();
  }
}
