package Patterns.Decorator;

public class BasicIceCream implements IceCream {

  public BasicIceCream(){
    System.out.println("Creating a basic Ice-Cream!");
  }

  @Override
  public double cost() {
    return 0.5;
  }

}
