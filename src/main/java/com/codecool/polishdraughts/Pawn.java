package com.codecool.polishdraughts;

public class Pawn {

    String color;
    int[] coordinates;

    public String getColor(int[] coordinates){
    return this.color;
    }

    public boolean isCrowned(int[] coordinates){
        return false;
    }

    public boolean isCorrectMove(int[] coordinates){
        return false;
    }

    public boolean isMultipleJumps(int[] coordinates){
        return false;
    }

}
