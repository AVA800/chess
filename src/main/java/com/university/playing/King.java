package com.university.playing;

public class King extends Pieces{
    public King(String white) {
        super(white);
    }

    public String toString(){
        return "Kg";
    }
    @Override
    public boolean moveValid(int x1, int y1,int x2, int y2) {
        int resX=x2-x1;
        int resY=y2-y1;
        if(Math.abs(resX)==Math.abs(resY)) {
            if(Math.abs(resX)==1) {
                return true;
            }else {return false;}
        }else if(Math.abs(resX)==1 && Math.abs(resY)==0 || Math.abs(resY)==1 && Math.abs(resX)==0) {
            return true;
        }
        return false;
    }
}
