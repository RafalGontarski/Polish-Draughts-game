package com.codecool.polishdraughts;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Board {


    private int[][] board;

    public static int n ;
    public Board(int n){
        board = new int[n][n];
    }
    public int[][] getBoard(){
        boolean input =false;


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
        return board;
    }

    public void printBoard(int n) {
        char[] columns = " abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] headers = Arrays.copyOfRange(columns,0,n+1);

        for (char header : headers) {
            System.out.print(header + "\t");
        }
        System.out.println();
        for (int i=1; i<n+1; i++){
            System.out.print(i + "\t".repeat(n+1)+ i);
            System.out.println();

        }
        for (char header : headers) {
            System.out.print(header + "\t");
        }
        System.out.println();

    }
//        public static Pawn[][] initializePawns(int n){
//        Pawn[][] boardWithPawns = new Pawn[n][n];
//        int pawnRows = 3;
//        for (int x=0; x<pawnRows; x++){
//            for (int y=0; y<boardWithPawns[x].length; y++){
//                if ((x%2 ==0 && y%2==0) || (x%2 !=0 && y%2!=0)){
//                    boardWithPawns[x][y] = new Pawn("black");
//                }
//            }
//        }
//
//        return boardWithPawns;
//
//    }



//    public static void main(String[] args) {
//        Board board = new Board(n);
//        board.getBoard();
//        board.printBoard(n);
//        //initializePawns(n);
//
//    }

}