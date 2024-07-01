package Patterns.State;

public class SodaMachine {

  final static int SOLD_OUT = 0;
  final static int NO_MONEY = 1;
  final static int HAS_MONEY = 2;
  final static int SOLD = 3;

  int state = SOLD_OUT;
  int count = 0;

  public SodaMachine(int count) {
    this.count = count;
    if (count > 0) {
      state = NO_MONEY;
    }
  }

  public void insertMoney() {
    if (state == HAS_MONEY) {
      System.out.println("You can't insert another dollar bill");
    } else if (state == NO_MONEY) {
      state = HAS_MONEY;
      System.out.println("You inserted a dollar");
    } else if (state == SOLD_OUT) {
      System.out.println("The machine is sold out");
    } else if (state == SOLD) {
      System.out.println("Enjoy your soda!");
    }
  }

  public void ejectMoney() {
    if (state == HAS_MONEY) {
      System.out.println("Returning the dollar bill");
      state = NO_MONEY;
    } else if (state == NO_MONEY) {
      System.out.println("You haven't inserted a dollar");
    } else if (state == SOLD_OUT) {
      System.out.println("Machine sold out");
    } else if (state == SOLD) {
      System.out.println("Already selected soda");
    }
  }

  public void selectSoda() {
    if (state == HAS_MONEY) {
      System.out.println("You selected a soda");
      state = SOLD;
      dispense();
    } else if (state == NO_MONEY) {
      System.out.println("You selected a soda but money first, buddy!");
    } else if (state == SOLD_OUT) {
      System.out.println("No sodas left");
    } else if (state == SOLD) {
      System.out.println("Dispensing your soda");
    }
  }

  public void dispense() {
    if (state == HAS_MONEY) {
      System.out.println("No sodas dispensed");
    } else if (state == NO_MONEY) {
      System.out.println("Please insert money first");
    } else if (state == SOLD_OUT) {
      System.out.println("Out of sodas");
    } else if (state == SOLD) {
      System.out.println("Soda dispensing");
      count = count - 1;
      if (count == 0) {
        System.out.println("Sorry, out of sodas");
        state = SOLD_OUT;
      } else {
        state = NO_MONEY;
      }
    }
  }

}
