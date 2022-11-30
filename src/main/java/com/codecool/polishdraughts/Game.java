package com.codecool.polishdraughts;

import java.util.Arrays;
import java.util.Scanner;

public class Game {

    public int[] getCoordinates(String message) {
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
