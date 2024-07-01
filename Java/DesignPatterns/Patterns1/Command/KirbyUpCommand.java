package Patterns.Command;

public class KirbyUpCommand implements Command{

  private KirbyCharacter kirby;

  public KirbyUpCommand(KirbyCharacter kirby){
    this.kirby = kirby;
  }

  @Override
  public void execute() {
    kirby.moveUp();
  }

}
