package Patterns.State;

public class SoldState implements State{

  SodaVendingMachine sodaVendingMachine;

  public SoldState(SodaVendingMachine sodaVendingMachine) {
    this.sodaVendingMachine = sodaVendingMachine;
  }

  @Override
  public void insertMoney() {
    System.out.println("Soda coming right up");
  }

  @Override
  public void ejectMoney() {
    System.out.println("Sorry... soda is coming...");
  }

  @Override
  public void select() {
    System.out.println("Nope you can't eject the money");
  }

  @Override
  public void dispense() {
    System.out.println("Enjoy your soda");
    if (sodaVendingMachine.count > 0) {
      sodaVendingMachine.setState(sodaVendingMachine.noMoneyState);
    } else {
      System.out.println("Out of sodas");
      sodaVendingMachine.setState(sodaVendingMachine.getSoldOutState());
    }
  }

  @Override
  public String toString() {
    return "dispensing soda";
  }

}
