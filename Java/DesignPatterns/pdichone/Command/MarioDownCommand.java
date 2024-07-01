package Patterns.Command;

public class MarioDownCommand implements Command{

  private MarioCharacter mario;

  public MarioDownCommand(MarioCharacter mario){
    this.mario = mario;
  }

  @Override
  public void execute() {
    mario.moveDown();
  }

}
