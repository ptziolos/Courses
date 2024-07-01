package Patterns.Bridge;

public class BridgePattern {

  public void runBridgePattern() {
    Vehicle bmw = new Car(new Make(), new Assemble());
    bmw.manufacture();

    Vehicle bmx = new Bike(new Make(), new Assemble());
    bmx.manufacture();
  }

}
