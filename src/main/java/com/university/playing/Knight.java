package com.university.playing;

public class Knight extends Pieces{
    public Knight(String white) {
        super(white);
    }

    public String toString(){
        return "Kn";
    };
    @Override
    public boolean moveValid(int x1, int y1,int x2, int y2) {
        int resX=x2-x1;
        int resY=y2-y1;
        if(Math.abs(resX)==1 && Math.abs(resY)==2) {
            return true;
        }
        if(Math.abs(resY)==1 && Math.abs(resX)==2) {
            return true;}
        return false;
    }
}
