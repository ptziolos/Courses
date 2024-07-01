package Patterns.Command;

public class KirbyDownCommand implements Command{

  private KirbyCharacter kirby;

  public KirbyDownCommand(KirbyCharacter kirby){
    this.kirby = kirby;
  }

  @Override
  public void execute() {
    kirby.moveDown();
  }

}
