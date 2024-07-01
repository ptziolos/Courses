package Patterns.Command;

public class GameBoy {

  private Command commandUp, commandDown, commandLeft, commandRight;

  public GameBoy(Command upcommand, Command downCommand, Command leftCommand,
      Command rightCommand) {
    commandUp = upcommand;
    commandDown = downCommand;
    commandLeft = leftCommand;
    commandRight = rightCommand;
  }

  public void arrowUp() {
    commandUp.execute();
  }

  public void arrowDown() {
    commandDown.execute();
  }

  public void arrowLeft() {
    commandLeft.execute();
  }

  public void arrowRight() {
    commandRight.execute();
  }

}
