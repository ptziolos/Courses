package Patterns.Visitor;

public class VisitorPattern {

  public void runVisitorPattern() {
    TaxVisitor taxVisitor = new TaxVisitor();

    Jacket jacket = new Jacket(55.99);
    TShirt tShirt = new TShirt(24.99);
    Shirt shirt = new Shirt(22.89);

    System.out.println(jacket.accept(taxVisitor));
    System.out.println(tShirt.accept(taxVisitor));
    System.out.println(shirt.accept(taxVisitor));
  }

}
