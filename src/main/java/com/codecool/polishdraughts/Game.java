package com.codecool.polishdraughts;

import java.util.Arrays;
import java.util.Scanner;
import com.codecool.polishdraughts.Board;
import static com.codecool.polishdraughts.Board.getBoardSize;

public class Game {
    public static void main(String[] args) {
        Board board = new Board(getBoardSize());
        board.printBoard(board.getBoard());

        int[] startCoordinates = getCoordinates("Pick pawn: ");
        int[] endCoordinates = getCoordinates("Pick field: ");
        System.out.println(Arrays.toString(startCoordinates));
        System.out.println(Arrays.toString(endCoordinates));

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
