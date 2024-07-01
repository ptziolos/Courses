package Patterns.Command;

public class KirbyCharacter {


  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void moveUp(){
    System.out.println(getName() + " soar up!");
  }

  public void moveLeft(){
    System.out.println(getName() + " flying left!");
  }

  public void moveRight(){
    System.out.println(getName() + " dashing right!");
  }

  public void moveDown(){
    System.out.println(getName() + " hiding!");
  }

}
