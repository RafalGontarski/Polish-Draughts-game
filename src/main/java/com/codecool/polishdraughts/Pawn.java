package com.codecool.polishdraughts;
import com.codecool.polishdraughts.Game.*;

import java.util.Scanner;

public class Pawn {

    String color;
    int coordinateX;
    int coordinateY;




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

    public boolean isCrowned(int[] coordinates){
        return false;
    }

    public boolean isCorrectMove(int startCoordinatesX, int startCoordinatesY, int endCoordinatesX, int endCoordinatesY){
        if (endCoordinatesX < 0 || endCoordinatesY < 0){
            return false;
        }
        int coordinateX = startCoordinatesX - endCoordinatesX;
        int coordinateY = startCoordinatesY - endCoordinatesY;
        if(this.getColor() == "O"){
            if (coordinateX == 1 && coordinateY == 1){
                return true;
            }
            else if (coordinateX == 2 && coordinateY == 2){
                return true;
            }
            else if (coordinateX == -1 && coordinateY == 1){
                return true;
            }
            else if (coordinateX == -2 && coordinateY == 2){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if (coordinateX == 1 && coordinateY == -1){
                return true;
            }
            else if (coordinateX == 2 && coordinateY == -2){
                return true;
            }
            else if (coordinateX == -1 && coordinateY == -1){
                return true;
            }
            else if (coordinateX == -2 && coordinateY == -2){
                return true;
            }
            else return false;
        }
    }

    public boolean isMultipleJumps(int[] coordinates){
        return false;
    }

}
