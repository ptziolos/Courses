package Patterns.Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank{

  private RealBank bank = new RealBank();
  private static List<String> bannedClients;

  static {
    bannedClients = new ArrayList<>();
    bannedClients.add("xXcs");
    bannedClients.add("me@me");
    bannedClients.add("@xmil.com");
  }

  @Override
  public void withdrawMoney(String client) throws Exception {
    if (bannedClients.contains(client.toLowerCase())) {
      throw new Exception(client + " your access is denied! You are not who you say you are!");
    }
    bank.withdrawMoney(client);
  }
}
