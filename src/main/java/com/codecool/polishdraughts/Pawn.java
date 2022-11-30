package com.codecool.polishdraughts;

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

    public boolean isCorrectMove(int[] coordinates){
        return false;
    }

    public boolean isMultipleJumps(int[] coordinates){
        return false;
    }

}
