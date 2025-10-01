package Patterns.Proxy;

public class RealBank implements Bank{

  @Override
  public void withdrawMoney(String client) throws Exception {
    System.out.println(client + " is withdrawing from the ATM...");
  }
}
