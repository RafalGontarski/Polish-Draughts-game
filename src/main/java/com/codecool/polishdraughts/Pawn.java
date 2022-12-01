package com.codecool.polishdraughts;

public class Pawn {

    String color;


    public Pawn(String player){
        color = player;

    }
    public Pawn(){
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString(){
        return getColor();
    }
    public  boolean isCorrectMove(Pawn[][] board, int startCoordinatesX, int startCoordinatesY, int endCoordinatesX, int endCoordinatesY) {
        if (endCoordinatesX < 0 || endCoordinatesY < 0) {
            return false;
        }
        int coordinateX = startCoordinatesX - endCoordinatesX;
        int coordinateY = startCoordinatesY - endCoordinatesY;
        int pawnRemovedX = (endCoordinatesX + startCoordinatesX) / 2;
        int pawnRemovedY = (endCoordinatesY + startCoordinatesY) / 2;

        if (board[startCoordinatesX][startCoordinatesY].color.equals("O")) {
            if (coordinateX == 1 && coordinateY == -1) return true;
            else if (coordinateX == 1 && coordinateY == 1) return true;
            if ((coordinateX == 2 && coordinateY == 2) || (coordinateX == -2 && coordinateY == 2) || (coordinateX == 2 && coordinateY == -2)) {
                return board[pawnRemovedX][pawnRemovedY].color.equals("X");
            }

        } else {
            if (coordinateX == -1 && coordinateY == 1) return true;
            else if (coordinateX == -1 && coordinateY == -1) return true;
            if ((coordinateX == 2 && coordinateY == -2) || (coordinateX == -2 && coordinateY == -2) || (coordinateX == -2 && coordinateY == 2)) {
                return board[pawnRemovedX][pawnRemovedY].color.equals("O");
            }
        }
        return false;
    }

}
