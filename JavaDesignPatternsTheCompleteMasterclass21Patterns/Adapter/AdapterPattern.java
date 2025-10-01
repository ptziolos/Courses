package Patterns.Adapter;

public class AdapterPattern {

  private static void testingAdapteeDevice() {
    SocketAdapter socketAdapter = new SocketAdapteeDevice();
    Volt v3 = getVolt(socketAdapter, 3);
    Volt v12 = getVolt(socketAdapter, 12);
    Volt v120 = getVolt(socketAdapter, 120);

    System.out.println(" V3 volts is using Adaptee Device " + v3.getVolts());
    System.out.println(" V12 volts is using Adaptee Device " + v12.getVolts());
    System.out.println(" V120 volts is using Adaptee Device " + v120.getVolts());
  }

  private static void testingAdapterDevice() {
    SocketAdapter socketAdapter = new SocketAdapterDevice();
    Volt v3 = getVolt(socketAdapter, 3);
    Volt v12 = getVolt(socketAdapter, 12);
    Volt v120 = getVolt(socketAdapter, 120);

    System.out.println(" V3 volts is using Adapter Device " + v3.getVolts());
    System.out.println(" V12 volts is using Adapter Device " + v12.getVolts());
    System.out.println(" V120 volts is using Adapter Device " + v120.getVolts());
  }

  private static Volt getVolt(SocketAdapter socketAdapter, int i) {
    switch (i) {
      case 3: return socketAdapter.get3Volts();
      case 12: return socketAdapter.get12Volts();
      case 120:
      default: return socketAdapter.get120Volts();
    }
  }

  public void runAdapterPattern() {
    testingAdapteeDevice();
    testingAdapterDevice();
  }

}
