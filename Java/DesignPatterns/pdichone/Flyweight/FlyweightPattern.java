package Patterns.Flyweight;

public class FlyweightPattern {

  private static final String colors[] = {"Red", "Blue", "Pink", "Brown"};

  public void runFlyweightPattern() {
    for (int i = 0; i < 20; i++) {
      Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
      circle.setX(getRandomX());
      circle.setY(getRandomY());
      circle.setRadius(400);
      circle.draw();
    }
  }

  private static String getRandomColor() {
    return colors[(int)(Math.random()*colors.length)];
  }

  private static int getRandomX() {
    return (int)(Math.random()*100);
  }
  private static int getRandomY() {
    return (int)(Math.random()*100);
  }

}
