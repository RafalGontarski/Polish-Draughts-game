package com.codecool.polishdraughts;

import java.util.Arrays;
import java.util.Scanner;
import com.codecool.polishdraughts.Board;
import static com.codecool.polishdraughts.Board.getBoardSize;

public class Game {

    static int firstPlayerPawn;
    static int secondPlayerPawn;


    String name;
    public static void main(String[] args) {
        System.out.println("\n" + "WELCOME TO POLISH DRAUGHTS BY\n");

        Game game = new Game();
        game.start();
    }

    void start() {
        int player = 1;
        boolean isWinner = false;
        Board board = new Board(getBoardSize());
        board.printBoard(board.getBoard());
        board.movePawn();

       while (true) {
            playRound(board.getBoard());
            board.printBoard(board.getBoard());
//            if (checkForWinner(firstPlayerPawn, secondPlayerPawn)) {
//                isWinner = true;
//                break;
//            } else if (checkForDraw(firstPlayerPawn, secondPlayerPawn)) {
//                break;
//            }
            Game game = new Game();
            game.switcher(player);
        }
    }

    void switcher(int player) {
        if (player == 1) {
            player = 2;
        }
        else {
            player = 1;
        }
    }

    void playRound(Pawn[][] board) {
//        boolean isWinner = false;
        int[] pawnPosition;
        int[] movePosition;
//        do {
            pawnPosition = getCoordinates("Pick pawn: ");
            movePosition = getCoordinates("Pick field: ");
            System.out.println(Arrays.toString(pawnPosition));
            System.out.println(Arrays.toString(movePosition));
//        }
//        while (!tryToMakeMove(pawnPosition[0], pawnPosition[1], movePosition[0], movePosition[1], pawnPosition[2]));

//        if (isNextStep(pawnPosition[0], pawnPosition[1], movePosition[0], movePosition[1], pawnPosition[2])) {
//            changePosition(pawnPosition[0], pawnPosition[1], movePosition[0], movePosition[1], pawnPosition[2], true);
//        } else {
//            changePosition(pawnPosition[0], pawnPosition[1], movePosition[0], movePosition[1], pawnPosition[2], false);
//        }
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

//    boolean tryToMakeMove(int pawnPosX, int pawnPosY, int movePosX, int movePosY, int player) {
//    }

//    boolean checkForWinner(int player1, int player2) {
//        if (player1 == 0 || player2 == 0) {
//            return true;
//        }
//        return false;
//    }

//    boolean isNextStep(int i, int i1, int i2, int i3, int i4) {
//    }

//    void changePosition(int i, int i1, int i2, int i3, int i4, boolean b) {
//    }

//    private boolean checkForDraw(int firstPlayerPawn, int secondPlayerPawn) {
//    }
}
