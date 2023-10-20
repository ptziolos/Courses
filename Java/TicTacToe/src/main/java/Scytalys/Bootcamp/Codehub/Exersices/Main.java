package Scytalys.Bootcamp.Codehub.Exersices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            new Game().start();
            while (true) {
                try {
                    running = playAgainQuestion();
                    break;
                } catch (InvalidAnswerException iae) {
                    System.out.println(iae.getMessage());
                }
            }
        }
    }

    public static boolean playAgainQuestion() throws InvalidAnswerException{
        System.out.println("Press y/n to play again: ");
        String answer = new Scanner(System.in).next();
        if (answer.equals("y")) {
            System.out.println("Have fun!");
            return true;
        } else if (answer.equals("n")) {
            System.out.println("Hope you enjoyed the game");
            return false;
        } else {
            throw new InvalidAnswerException();
        }
    }
}
