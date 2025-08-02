package com.university.playing;

public class Rook extends Pieces{
    public Rook(String white) {
        super(white);
    }

    public String toString(){
        return "Rk";
    }
    @Override
    public boolean moveValid(int x1, int y1,int x2, int y2) {
        int resX=x2-x1;
        int resY=y2-y1;
        if(resY!=0 && resX==0) {
            return true;
        };
        if(resX!=0 && resY==0) {
            return true;}

        return false;}
}
