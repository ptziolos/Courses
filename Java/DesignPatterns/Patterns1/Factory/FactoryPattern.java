package Patterns.Factory;

public class FactoryPattern {

  public void runFactoryPattern(){
    HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
    HamburgerStore jamaicanBurgerStore = new JamHamburgerStore();

    Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");

    System.out.println("Ordered " + hamburger.getName() + "\n");

    hamburger = jamaicanBurgerStore.orderHamburger("veggie");

    System.out.println("Ordered " + hamburger.getName() + "\n");
  }

}
