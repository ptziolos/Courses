package Patterns.Mediator;

public interface ATCMediator {
  void sendMessage(String msg, AirCraft airCraft);
  void addAirCraft(AirCraft airCraft);
}
