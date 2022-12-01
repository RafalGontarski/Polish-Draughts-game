package com.codecool.polishdraughts;

import java.util.Scanner;
import static com.codecool.polishdraughts.Board.getBoardSize;

public class Game {

    public static void main(String[] args) {
        System.out.println("\n" + "WELCOME TO POLISH DRAUGHTS BY\n");

        Game game = new Game();
        game.start();
    }

    void start() {
        int player = 1;
        Board board = new Board(getBoardSize());
       while (true) {
           board.printBoard(board.getBoard());
           board.movePawn(player);

           if (player == 1) {
               player = 2;
           }
           else {
               player = 1;
           }
        }
    }

    public static int[] getCoordinates(String message) {
        int[] coordinates = new int[2];
        String columns = "abcdefghijklmnopqrstuvwxyz";
        Scanner pawn = new Scanner(System.in);

        System.out.println(message);
        String userInput = pawn.nextLine();
        String column = userInput.substring(0, 1).toLowerCase();
        int row = Integer.parseInt(userInput.substring(1));
        coordinates[0] = columns.indexOf(column);
        coordinates[1] = row - 1;
        return coordinates;
    }
}
