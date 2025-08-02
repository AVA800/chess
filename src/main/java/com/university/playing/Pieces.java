package com.university.playing;

public class Pieces {
    public boolean moveValid(int x1, int y1,int x2, int y2) {
        return true;
    };
    public String team;
    public Pieces(String team){
        this.team=team;
    }
    public boolean teamAssigned(int y1) {

        if(0<=y1 && y1<=1) {
            this.team="white";

        } else if(6<=y1 && y1<=7) {
            this.team="black";

        } else{this.team="empty";};
        return true;
    }
}
