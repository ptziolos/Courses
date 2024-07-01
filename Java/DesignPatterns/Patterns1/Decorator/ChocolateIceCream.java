package Patterns.Decorator;

public class ChocolateIceCream extends IceCreamDecorator{

  public ChocolateIceCream(IceCream iceCream) {
    super(iceCream);
  }

  @Override
  public double cost() {
    System.out.println("Adding Chocolate Ice-cream!");
    return 1.0 + super.cost();
  }

}
