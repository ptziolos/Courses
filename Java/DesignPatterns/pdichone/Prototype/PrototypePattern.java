package Patterns.Prototype;

public class PrototypePattern {

  public void runPrototypePattern() {
    Tiger tiger = new Tiger("James", 45);
          System.out.println("Tiger 1: " + tiger);

    Tiger secondTiger = (Tiger)tiger.clone();
          System.out.println("Tiger copy: " + secondTiger);

          System.out.println(System.identityHashCode(tiger) + " \n"
        + System.identityHashCode(secondTiger));

    Person bonni = new Person("Bonni", 21);
         System.out.println("Person 1:  " + bonni);

    Person nina = (Person)bonni.clone();
         nina.setName("Nina");
         System.out.println("Person 2: " + nina);

    Dolphin jerrry = new Dolphin("Jerry", 78);
         System.out.println("Dolphin 1: " + jerrry);

    Dolphin sam = (Dolphin)jerrry.clone();
         System.out.println("Dolphin 2: " + sam);
  }

}
