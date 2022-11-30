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

    public boolean isCorrectMove(int[] startCoordinates, int[] endCoordinates){
        if (endCoordinates[0] < 0 || endCoordinates[1] < 0){
            return false;
        }
        int coordinateX = startCoordinates[0] - endCoordinates[0];
        int coordinateY = startCoordinates[1] - endCoordinates[1];
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
