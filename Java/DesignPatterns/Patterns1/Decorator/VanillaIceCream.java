package Patterns.Decorator;

public class VanillaIceCream extends IceCreamDecorator{

  public VanillaIceCream(IceCream iceCream) {
    super(iceCream);
  }

  @Override
  public double cost() {
    System.out.println("Adding Vanilla Ice-cream!");
    return 1.0 + super.cost();
  }

}
