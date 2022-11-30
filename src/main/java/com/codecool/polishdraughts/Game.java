package com.codecool.polishdraughts;

import com.codecool.polishdraughts.Board;
import static com.codecool.polishdraughts.Board.getBoardSize;

public class Game {
    public static void main(String[] args) {
        Board board = new Board(getBoardSize());
        board.printBoard(board.getBoard());
    }
}
