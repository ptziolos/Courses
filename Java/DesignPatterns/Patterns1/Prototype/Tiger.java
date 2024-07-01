package Patterns.Prototype;

public class Tiger implements Animal {
  private String name;
  private int age;

  public Tiger(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("Tiger is created!");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public Animal clone() {
    System.out.println("Creating Tiger...");
    Tiger tiger = null;
    try {
      tiger = (Tiger)super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return tiger;
  }

  @Override
  public String toString() {
    return "Tiger: " + name;
  }
}
