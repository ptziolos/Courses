package Patterns.Command;

public class KirbyRightCommand implements Command{

  private KirbyCharacter kirby;

  public KirbyRightCommand(KirbyCharacter kirby){
    this.kirby = kirby;
  }

  @Override
  public void execute() {
    kirby.moveRight();
  }

}
