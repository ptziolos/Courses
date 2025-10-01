package Patterns.Command;

public class KirbyLeftCommand implements Command{

  private KirbyCharacter kirby;

  public KirbyLeftCommand(KirbyCharacter kirby){
    this.kirby = kirby;
  }

  @Override
  public void execute() {
    kirby.moveLeft();
  }

}
