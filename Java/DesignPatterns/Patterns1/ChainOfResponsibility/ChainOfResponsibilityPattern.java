package Patterns.ChainOfResponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChainOfResponsibilityPattern {

  public void runChainOfResponsibilityPattern() {
    CEOPurchasePower ceoPurchasePower = new CEOPurchasePower();
    DirectorPurchasePower directorPurchasePower = new DirectorPurchasePower();
    ManagerPurchasePower managerPurchasePower = new ManagerPurchasePower();

    ceoPurchasePower.setSuccessor(directorPurchasePower);
    directorPurchasePower.setSuccessor(ceoPurchasePower);
    managerPurchasePower.setSuccessor(directorPurchasePower);

//    System.out.println("Enter the amount to check who should approve your budget:");
//    System.out.print(">>");

    double purchaseAmounts[] = {1000.7, 15000.5, 10000000.3};

//    try {
//      double amount = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
//      managerPurchasePower.processRequest(new PurchaseRequest(amount, "By Stuff"));
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

    for (double amount : purchaseAmounts) {
      managerPurchasePower.processRequest(new PurchaseRequest(amount, "By Stuff"));
    }
  }

}
