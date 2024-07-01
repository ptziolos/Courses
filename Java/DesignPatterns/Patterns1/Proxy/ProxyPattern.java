package Patterns.Proxy;

public class ProxyPattern {

  public void runProxyPattern(){
    Bank bank = new ProxyBank();

    try {
      bank.withdrawMoney("Paulo");
      bank.withdrawMoney("me@me");
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }

  }

}
