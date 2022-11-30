package com.codecool.polishdraughts;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.codecool.polishdraughts.Game;

public class Board {


    private Pawn[][] board;

    public Board(int n){
       // board = new String[n][n];
        board = setPawns(new Pawn[n][n]);

    }


    public Pawn[][] getBoard() {
        return board;
    }
    public static int getBoardSize() {
        int n = 0;
        boolean input = false;

        while (!input) {
            Scanner boardSize = new Scanner(System.in);
            System.out.println("Enter board size. Choose between 10 and 20: ");
            try {
                int userInput = boardSize.nextInt();
                if (userInput >= 10 && userInput <= 20) {
                    n = userInput;
                    input = true;

                } else {
                    System.out.println("Number out of range! Try again !");
                }
            } catch (InputMismatchException number) {
                System.out.println("Wrong input try again!");
            }
        }
       return n;
    }


    public void printBoard(Pawn[][] board) {
        char[] columns = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder boardBuilder = new StringBuilder("    ");
        for (int row = 0; row < board.length; row++) {
            boardBuilder.append(columns[row]).append("  ");
        }
        boardBuilder.append("\n");
        for (int row = 0; row < board.length; row++) {
            if (row < 9) {
                boardBuilder.append(row + 1).append("  ");
            } else {
                boardBuilder.append(row + 1).append(" ");
            }
            for (int column = 0; column < board[row].length; column++) {
                if (board[row][column] == null) {
                    if ((row + column) % 2 == 0) {
                        boardBuilder.append("\u001b[47;1m" + "   " + "\u001b[0m");
                    } else {
                        boardBuilder.append("   ");
                    }
                } else {
                    switch (board[row][column].toString()) {
                        case "O":
                            boardBuilder.append(" ").append("O").append(" ");
                            break;
                        case "X":
                            boardBuilder.append(" ").append("X").append(" ");
                            break;
                        default:

                    }
                }
            }
            boardBuilder.append(" ").append(row + 1);
            boardBuilder.append("\n");
        }
        boardBuilder.append("\t");
        for (int row = 0; row < board.length; row++) {
            boardBuilder.append(columns[row]).append("  ");

        }
        System.out.println(boardBuilder);
    }


    private Pawn[][] setPawns(Pawn[][] board) {
        return createPawns(board);

    }
    private Pawn[][] createPawns(Pawn[][] board){
        for (int row =0; row<3; row++) {
                for (int column = 0; column < board[0].length; column ++) {
                    if ((row % 2 != 0 && column % 2 == 0) || (row % 2 == 0 && column % 2 != 0)) {
                        board[row][column] = new Pawn("X");
                    }
                }
            }
        for (int row = board.length-3; row<board.length; row++){
            for (int column =0; column<board[0].length;column++){
                if ((row % 2 != 0 && column % 2 == 0) || (row % 2 == 0 && column % 2 != 0)) {
                    board[row][column] = new Pawn("O");
                }
            }
        }
        return board;
    }




    public static void main(String[] args) {
        Board board = new Board(getBoardSize());
        board.printBoard(board.getBoard());
        Game game = new Game();
        int[] startCoordinates = game.getCoordinates("Pick pawn: ");
        int[] endCoordinates = game.getCoordinates("Pick field: ");
//        System.out.println(startCoordinates);
//        System.out.println(Arrays.toString(endCoordinates));

    }

}