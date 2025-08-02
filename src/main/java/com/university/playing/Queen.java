package com.university.playing;

public class Queen extends Pieces{
    public Queen(String white) {
        super(white);
    }

    public String toString(){
        return "Qn";
    }
    @Override
    public boolean moveValid(int x1, int y1,int x2, int y2) {
        int resX=x2-x1;
        int resY=y2-y1;
        if(resX==0 && resY!=0 || resY==0 && resX!=0) {
            return true;
        };
        if(Math.abs(resX)==Math.abs(resY)) {
            return true;
        }
        return false;
    }
}
