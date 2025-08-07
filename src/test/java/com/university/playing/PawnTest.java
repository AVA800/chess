package com.university.playing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PawnTest {
    @Test
    public void toStringTest(){
        Pawn pawn=new Pawn("white");
        Assertions.assertEquals("Pa",pawn.toString());
    }
    @Test
    public void moveValidTest(){
        Pawn pawn1=new Pawn("white");
        Assertions.assertEquals(true,pawn1.moveValid(99,50,99,51));
        Assertions.assertEquals(false,pawn1.moveValid(99,50,99,50));
        Pawn pawn2=new Pawn("black");
        Assertions.assertEquals(true,pawn2.moveValid(99,55,99,54));
        Assertions.assertEquals(false,pawn2.moveValid(99,55,99,53));

    }

}
