package Patterns.Builder;

public class BuilderPattern {

  public void runBuilderPattern() {
    User James = new User.UserBuilder("James", "Bond")
        .age(31)
        .phoneNumber("007")
        .build();

    System.out.println(James);

    Person Jason = new Person.Builder("Jason", "Born")
        .phone("001")
        .address("Unknown")
        .age(32)
        .build();

    System.out.println(Jason);
  }

}
