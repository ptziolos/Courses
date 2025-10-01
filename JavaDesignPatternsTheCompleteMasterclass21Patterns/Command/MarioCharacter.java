package Patterns.Command;

public class MarioCharacter {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void moveUp(){
    System.out.println(getName() + " jumping up!");
  }

  public void moveLeft(){
    System.out.println(getName() + " moving left!");
  }

  public void moveRight(){
    System.out.println(getName() + " going right!");
  }

  public void moveDown(){
    System.out.println(getName() + " ducking!");
  }

}
