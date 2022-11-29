package com.codecool.polishdraughts;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Board {


    private int[][] board;
    
    public Board(int n){
        board = new int[n][n];


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


    public void printBoard() {
        char[] columns = " abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] headers = Arrays.copyOfRange(columns,0,board.length+2);

        for (char header : headers) {
            System.out.print(" " +header + " ");
        }
        System.out.println();
        for (int i=0; i<board.length; i++){
            if (i<9) {
                System.out.print(i + 1 + "  ");
            } else {
                System.out.print(i+1+ " ");
            }
            for (int j=0; j<=board.length; j++){
                if ((i+j) % 2 ==0 ){

                    System.out.print("\u001b[47;1m" + "   " + "\u001b[0m");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print(" "+(i+1));
            System.out.println();

        }
        for (char header : headers) {
            System.out.print(" " +header + " ");
        }
        System.out.println();

    }





    public static void main(String[] args) {
        Board board = new Board(getBoardSize());
        board.printBoard();

    }

}