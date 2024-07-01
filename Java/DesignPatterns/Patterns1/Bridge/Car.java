package Patterns.Bridge;

public class Car extends Vehicle{
  public Car(WorkShop workshop, WorkShop workShop2) {
    super(workshop, workShop2);
  }

  @Override
  public void manufacture() {
    System.out.println("Car..");
    workshop.make();
    workshop2.make();
  }
}
