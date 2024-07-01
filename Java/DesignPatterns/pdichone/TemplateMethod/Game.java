package Patterns.Template_Method;

public abstract class Game {

  abstract void initialize();
  abstract void startPlay();
  abstract void endPlay();
  protected abstract void addNewGameCharacterToTheGame();

  public final void play(){
    loadAssets();
    initialize();
    startPlay();
    addNewGameCharacterToTheGame();
    endPlay();
  }

  void loadAssets(){
    System.out.println("Loading game assets...");
  }

}
