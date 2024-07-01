package Patterns.Template_Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EndlessRunnerGame extends Game {

  @Override
  void initialize() {
    System.out.println("Endless Runner initializing...");
  }

  @Override
  void startPlay() {
    System.out.println("Endless Runner starting...");
  }

  @Override
  void endPlay() {
    System.out.println("Endless Runner ending...");
  }

  @Override
  protected void addNewGameCharacterToTheGame() {
    if (playerWantsNewCharacter()){
      System.out.println("Adding new Character to the game");
    }
  }

  private boolean playerWantsNewCharacter() {
//    String answer = getUserInput();
    String answer = "yes";
    if (answer.toLowerCase().startsWith("y")) {
      return true;
    } else {
      return false;
    }
  }

  private String getUserInput() {
    String answer = "no";
    System.out.println("Would you like to add a new character to the game? (y/n)");
    BufferedReader in = new BufferedReader(new InputStreamReader((System.in)));
    try {
      answer = in.readLine();
    } catch (IOException ioException) {
      System.out.println("IO ERROR");
    }
    return answer;
  }
}
