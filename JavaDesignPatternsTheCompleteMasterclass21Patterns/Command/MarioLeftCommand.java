package Patterns.Command;

public class MarioLeftCommand implements Command{

  private MarioCharacter mario;

  public MarioLeftCommand(MarioCharacter mario){
    this.mario = mario;
  }

  @Override
  public void execute() {
    mario.moveLeft();
  }

}
