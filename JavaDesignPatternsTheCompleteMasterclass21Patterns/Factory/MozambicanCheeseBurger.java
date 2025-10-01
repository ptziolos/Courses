package Patterns.Factory;

public class MozambicanCheeseBurger extends Hamburger{

  public MozambicanCheeseBurger(){
    name = "Mozambican style cheeseburger";
    sauce = "Spicy mozambican sauce";
    buns = "Cookie dough buns";
  }

  @Override
  public void cook() {
    System.out.println("cooking jamaican style...");
  }
}
