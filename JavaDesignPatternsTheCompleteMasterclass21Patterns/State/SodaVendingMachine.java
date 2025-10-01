package Patterns.State;

public class SodaVendingMachine {

  State soldOutState;
  State noMoneyState;
  State hasMoneyState;
  State soldState;

  State state = soldOutState;
  int count = 0;

  public SodaVendingMachine(int numberOfSodas) {
    soldOutState = new SoldOutState(this);
    noMoneyState = new NoMoneyState(this);
    hasMoneyState = new HasMoneyState(this);
    soldState = new SoldState(this);
    this.count = numberOfSodas;

    if (numberOfSodas > 0) {
      state = noMoneyState;
    }

  }

  public void insertMoney() {
    state.insertMoney();
  }

  public void selectSoda() {
    state.select();
    state.dispense();
  }

  public int getCount() {
      return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getNoMoneyState() {
    return noMoneyState;
  }

  public State getHasMoneyState() {
    return hasMoneyState;
  }

  public State getSoldState() {
    return soldState;
  }

  @Override
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("\nThe SodaMachine, Co");
    result.append("\nInventory: " + count + " Soda");
    if (count != 1) {
      result.append("s");
    }
    result.append("\n");
    result.append("Soda Vending Machine is " + state + "\n");
    return result.toString();
  }
}
