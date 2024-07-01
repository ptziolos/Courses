package Patterns.Command;

public class MarioUpCommand implements Command{

  private MarioCharacter mario;

  public MarioUpCommand(MarioCharacter mario){
    this.mario = mario;
  }

  @Override
  public void execute() {
    mario.moveUp();
  }

}
