package Patterns.Bridge;

abstract class Vehicle {
  protected WorkShop workshop;
  protected WorkShop workshop2;

  public Vehicle(WorkShop workshop, WorkShop workShop2) {
    this.workshop = workshop;
    this.workshop2 = workShop2;
  }

  abstract public void manufacture();
}
