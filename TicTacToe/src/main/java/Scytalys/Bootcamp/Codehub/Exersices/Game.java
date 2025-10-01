package Scytalys.Bootcamp.Codehub.Exersices;

import java.util.Scanner;

public class Game {
    public int round;
    public boolean running;
    public final Scanner scan;
    public final Board board;
    public final char[] player;

    public Game(){
        round = 0;
        running = true;
        scan = new Scanner(System.in);
        board = new Board();
        player = new char[2];
    }

    public void start(){
        System.out.println("You are playing TicTacToe");
        board.printBoard();
        player[0] = 'X';
        player[1] = 'O';

        char currentPlayer = player[0];
        while(running){
            System.out.println("Player " + currentPlayer + " your turn!\nEnter your move");
            try {
                int move = Integer.parseInt(scan.next());
                board.makeMove(currentPlayer, move);
                board.printBoard();
                if (board.isTicTacToe() == 1) {
                    System.out.println("Player " + currentPlayer + " Congratulations, you won!!!");
                    running = false;
                } else if (board.isTicTacToe() == 0) {
                    System.out.println("Wow it's a tie!");
                    running = false;
                }
                currentPlayer = currentPlayer == player[1] ? player[0] : player[1];
            } catch (NumberFormatException nfe){
                System.out.println("Not a number");
            } catch (NotAvailableMoveException nam) {
                System.out.println("Can't move there " + nam.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
