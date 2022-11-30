package com.codecool.polishdraughts;

//import java.util.Arrays;
//import java.util.InputMismatchException;
//import java.util.Scanner;

public class Board {

    private Pawn[][] board = null;
    private static Board polishDraughts;

    private Board(int n) {
        Pawn[][] board = new Pawn[n][n];
        this.setBoard(board);
    }

    public static Board getInstance(int n) {
        if (polishDraughts == null) {
            polishDraughts = new Board(n);
        }
        return polishDraughts;
    }

    public Pawn[][] getBoard() {
        return board;
    }

    public void setBoard(Pawn[][] board) {
        this.board = board;
    }

    public void fillPawns() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i == 0 && j % 2 == 0) {
                    board[i][j] = new Pawn(1, i, j);
                } else if (i == 1 && j % 2 != 0) {
                    board[i][j] = new Pawn(1, i, j);
                } else if (i == 2 && j % 2 == 0) {
                    board[i][j] = new Pawn(1, i, j);
                } else if (i == getBoard().length - 1 && j % 2 == 0) {
                    board[i][j] = new Pawn(2, i, j);
                } else if (i == getBoard().length - 2 && j % 2 != 0) {
                    board[i][j] = new Pawn(2, i, j);
                } else if (i == getBoard().length - 3 && j % 2 == 0) {
                    board[i][j] = new Pawn(2, i, j);
                }
            }
        }
    }


    public void displayBoard(Pawn[][] board, int player1, int player2) {
        String[] numbers = {"   ", "1  ", "2  ", "3  ", "4  ", "5  ", "6  ", "7  ", "8  ", "9 ", "10 ", "11 ", "12 ", "13 ", "14 ", "15 ", "16 ", "17 ", "18 ", "19 ", "20  "};
        for (int i = 0; i <= 1; i++) {
            System.out.println();
            for (int j = 0; j <= board.length; j++) {
                if (i == 0) {
                    System.out.print(numbers[j]);
                }
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < board.length; j++) {
                System.out.print("");
                if (board[i][j] != null) {
                    if (board[i][j].getPlayerOne()) {
                        System.out.print("\033[0;34m O \033[0m");
                    } else {
                        System.out.print("\033[0;33m X \033[0m");
                    }
                } else {
                    if (i % 2 != 0) {
                        if (j % 2 != 0) {
                            System.out.print("   ");
                        } else {
                            System.out.print("\u001b[47;1m" + "   " + "\u001b[0m");
                        }
                    }
                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            System.out.print("   ");
                        } else {
                            System.out.print("\u001b[47;1m" + "   " + "\u001b[0m");
                        }
                    }
                }
                if (i == 0) {
                    if (j == board.length - 1) {
                        System.out.print(" \033[0;34m Player 1 pawns: \033[0m" + player1);
                    }
                } else if (i == board[0].length - 1) {
                    if (j == board.length - 1) {
                        System.out.print(" \033[0;33m Player 2 pawns: \033[0m" + player2);
                    }
                }
            }
            System.out.println();
        }
    }



//    public int[][] getBoard(){
//        boolean input =false;
//
//
//        while (!input) {
//            Scanner boardSize = new Scanner(System.in);
//            System.out.println("Enter board size. Choose between 10 and 20: ");
//            try {
//                int userInput = boardSize.nextInt();
//                if (userInput >= 10 && userInput <= 20) {
//                    n = userInput;
//                    input = true;
//                } else {
//                    System.out.println("Number out of range! Try again !");
//                }
//            } catch (InputMismatchException number) {
//                System.out.println("Wrong input try again!");
//            }
//        }
//        return board;
//    }

//    public void printBoard(Pawn[][] board, int player1, int player2, int n) {
//        char[] columns = " abcdefghijklmnopqrstuvwxyz".toCharArray();
//        char[] headers = Arrays.copyOfRange(columns,0,n+2);
//
//        for (char header : headers) {
//            System.out.print(" " +header + " ");
//        }
//        System.out.println();
//        for (int i=0; i<n; i++){
//            if (i<9) {
//                System.out.print(i + 1 + "  ");
//            } else {
//                System.out.print(i+1+ " ");
//            }
//
//            for (int j=0; j<=n; j++){
//                if ((i+j) % 2 ==0 ){
//
//                    System.out.print("\u001b[47;1m" + "   " + "\u001b[0m");
//                } else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//
//        }
//        for (char header : headers) {
//            System.out.print(" " +header + " ");
//        }
//        System.out.println();
//
//
//
//    }
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
    //initializePawns(n);

}

