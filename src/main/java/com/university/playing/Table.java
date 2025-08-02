package com.university.playing;

import com.university.dto.ChessRequest;
import org.springframework.stereotype.Service;

@Service
public class Table {

     Pieces[][] tablero= {{new Rook("white"),new Knight("white"),new Bishop("white"),new Queen("white"),new King("white"),new Bishop("white"),new Knight("white"),new Rook("white")},
            {new Pawn("white"),new Pawn("white"),new Pawn("white"),new Pawn("white"),new Pawn("white"),new Pawn("white"),new Pawn("white"),new Pawn("white")},
            {null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null},
            {new Pawn("black"),new Pawn("black"),new Pawn("black"),new Pawn("black"),new Pawn("black"),new Pawn("black"),new Pawn("black"),new Pawn("black")},
            {new Rook("black"),new Knight("black"),new Bishop("black"),new Queen("black"),new King("black"),new Bishop("black"),new Knight("black"),new Rook("black")}
    };
//    public static void main(String[] args){
//        String firstPosition="a1";
//        String finalPosition="a2";
//        layout1();
//        movement(firstPosition,finalPosition);
//        layout2();
//
//    }
    public  void layout1() {
        for(int i=0;i<tablero.length;i++) {
            String line="";
            for(int ii=0;ii<tablero[i].length;ii++) {
                if (tablero[i][ii]!=null) {
                    tablero[i][ii].teamAssigned(i);
                    String name=tablero[i][ii].toString();
                    line+=name+" ";} else {
                    line=line+"   ";
                }
            }
            System.out.println(line);
        }
    }
    public  String layout2() {
        String result="";
        for(int i=0;i<tablero.length;i++) {
            String line="";
            for(int ii=0;ii<tablero[i].length;ii++) {
                if (tablero[i][ii]!=null) {
                    String name=tablero[i][ii].toString();
                    line+=name+" ";} else {
                    line=line+"   ";
                }
            }
            System.out.println(line);
            result=result+line+"\n";
        }return result;
    }
    public  String movement(String pos1 ,String pos2) {
        int x1=pos1.charAt(0)-97;
        int y1=pos1.charAt(1)-49;
        int x2=pos2.charAt(0)-97;
        int y2=pos2.charAt(1)-49;
        boolean confirmValid=tablero[y1][x1].moveValid(x1,y1,x2,y2);
        if(tablero[y2][x2]==null && confirmValid==true) {
            System.out.println("Valid");
            tablero[y2][x2]=tablero[y1][x1];
            tablero[y1][x1]=null;
            return "valid";
        }
        else if (tablero[y2][x2]!=null && confirmValid==true && tablero[y1][x1].team!=tablero[y2][x2].team) {
            System.out.println("Valid");
            tablero[y2][x2]=tablero[y1][x1];
            tablero[y1][x1]=null;
            return "valid";
        }
        else if(tablero[y2][x2]!=null && confirmValid==true && tablero[y1][x1].team==tablero[y2][x2].team) {
            System.out.println("No Valid!!");
            return "no valid";
        } else{return "no valid";}
    }
}
