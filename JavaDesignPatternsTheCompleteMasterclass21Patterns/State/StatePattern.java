package Patterns.State;

public class StatePattern {

  public void runStatePattern(){
//    SodaMachine sodaMachine = new SodaMachine(10);

//    sodaMachine.insertMoney();
//    sodaMachine.selectSoda();

//    System.out.println("Inventory: " + sodaMachine.count + "\n");

//    sodaMachine.insertMoney();
//    sodaMachine.ejectMoney();
//    sodaMachine.selectSoda();

//    System.out.println("Inventory: " + sodaMachine.count + "\n");

//    sodaMachine.insertMoney();
//    sodaMachine.selectSoda();
//    sodaMachine.insertMoney();
//    sodaMachine.selectSoda();
//    sodaMachine.ejectMoney();

//    System.out.println("Inventory: " + sodaMachine.count + "\n");


    SodaVendingMachine sodaVendingMachine = new SodaVendingMachine(10);
    System.out.println(sodaVendingMachine);

    sodaVendingMachine.insertMoney();
    sodaVendingMachine.selectSoda();

    System.out.println(sodaVendingMachine);

    sodaVendingMachine.insertMoney();
    sodaVendingMachine.selectSoda();

    sodaVendingMachine.insertMoney();
    sodaVendingMachine.selectSoda();

    System.out.println(sodaVendingMachine);

  }

}
