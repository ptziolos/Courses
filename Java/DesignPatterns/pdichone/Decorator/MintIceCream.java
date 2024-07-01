package Patterns.Decorator;

public class MintIceCream extends IceCreamDecorator{

  public MintIceCream(IceCream iceCream) {
    super(iceCream);
  }

  @Override
  public double cost() {
    System.out.println("Adding Mint Ice-cream!");
    return 1.5 + super.cost();
  }

}
