package Patterns.Template_Method;

public class FootballGame extends Game{

  @Override
  void initialize() {
    System.out.println("Football initializing...");
  }

  @Override
  void startPlay() {
    System.out.println("Football starting...");
  }

  @Override
  void endPlay() {
    System.out.println("Football ending...");
  }

  @Override
  protected void addNewGameCharacterToTheGame() {
    System.out.println("Cannot add new character to the game");
  }

}
