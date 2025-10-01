package Patterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator {
  private List<AirCraft> airCraftList;

  public ATCMediatorImpl() {
    this.airCraftList = new ArrayList<>();
  }

  @Override
  public void sendMessage(String msg, AirCraft airCraft) {
    for (AirCraft a : airCraftList) {
      if (a != airCraft) {
        a.receive(msg);
      }
    }
  }

  @Override
  public void addAirCraft(AirCraft airCraft) {
    airCraftList.add(airCraft);

  }
}
