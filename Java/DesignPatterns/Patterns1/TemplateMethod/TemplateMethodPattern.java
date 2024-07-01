package Patterns.Template_Method;

public class TemplateMethodPattern {

  public void runTemplateMethodPattern(){
    Game game = new FootballGame();
    game.play();

    System.out.println("----------------------------------");

    game = new EndlessRunnerGame();
    game.play();
  }

}
