package com.university.playing;

public class Bishop extends Pieces{
    public Bishop(String white) {
        super(white);
    }

    public String toString(){
        return "Bi";
    }
    @Override
    public boolean moveValid(int x1, int y1,int x2, int y2) {
        int resX=x2-x1;
        int resY=y2-y1;
        if(Math.abs(resX)==Math.abs(resY)) {
            return true;
        } else {return false;}
    }
}
