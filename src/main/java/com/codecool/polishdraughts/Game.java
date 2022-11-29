package src.main.java.com;

import java.util.Scanner;

public class Game {
    static int n;
    public static void main(String[] args) {
        Game game = new Game();

        System.out.println("\n" +
                "WELCOME TO POLISH DRAUGHTS BY\n" +
                "\nJOANNA SMOLIŃSKA\n" +
                "ANETA WAWER\n" +
                "RAFAŁ GONTARSKI\n");

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Choose board size between 10-20: ");
            n = scanner.nextInt();
            //check valid input
            if (n < 10 || n > 20) {
                System.out.println("Size out of range");
            } else {
                System.out.println("Dobra robota!");
                break;
            }
        }
        game.start();
    }

    private void start() {
        int player = 1;
        boolean isWinner = false;

        while (true) {

            //switch player
            if (player == 1){
                player = 2;
            } else {
                player = 1;
            }
        }


    }
}
