package Patterns.Mediator;

public class MediatorPattern {

  public void runMediatorPattern() {
    ATCMediator mediator = new ATCMediatorImpl();

    AirCraft boing1 = new AirCraftImpl(mediator,"Boing 1");
    AirCraft helicopter = new AirCraftImpl(mediator, "Helicopter");
    AirCraft boing707 = new AirCraftImpl(mediator, "Boing 707");

    mediator.addAirCraft(boing1);
    mediator.addAirCraft(helicopter);
    mediator.addAirCraft(boing707);

    boing1.send("Hello from Boing 1");
  }

}
