package com.university.playing;

public class Pawn extends Pieces{
    public Pawn(String white) {
        super(white);
    }

    public String toString(){
        return "Pa";
    }
    @Override
    public boolean moveValid(int x1, int y1,int x2, int y2) {
        int resY=y2-y1;
        int resX=x2-x1;
        if(team.contains("white") && resY==1 && resX==0) {
            return true;
        }
        if(team.contains("black") && resY==-1 && resX==0) {
            return true;
        }
        return false;
    }
}
