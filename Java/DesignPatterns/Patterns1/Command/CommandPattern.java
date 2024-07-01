package Patterns.Command;

public class CommandPattern {

  public void runCommandPattern(){
    MarioCharacter mario = new MarioCharacter();
    mario.setName("Mario");

    KirbyCharacter kirby = new KirbyCharacter();
    kirby.setName("Kirby");

    MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
    MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
    MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
    MarioRightCommand marioRightCommand = new MarioRightCommand(mario);

    KirbyUpCommand kirbyUpCommand = new KirbyUpCommand(kirby);
    KirbyDownCommand kirbyDownCommand = new KirbyDownCommand(kirby);
    KirbyLeftCommand kirbyLeftCommand = new KirbyLeftCommand(kirby);
    KirbyRightCommand kirbyRightCommand = new KirbyRightCommand(kirby);

    GameBoy gameBoy = new GameBoy(marioUpCommand, marioDownCommand, marioLeftCommand, marioRightCommand);

    gameBoy.arrowUp();
    gameBoy.arrowDown();
    gameBoy.arrowLeft();
    gameBoy.arrowRight();

    gameBoy = new GameBoy(kirbyUpCommand, kirbyDownCommand, kirbyLeftCommand, kirbyRightCommand);

    gameBoy.arrowUp();
    gameBoy.arrowDown();
    gameBoy.arrowLeft();
    gameBoy.arrowRight();

  }

}
