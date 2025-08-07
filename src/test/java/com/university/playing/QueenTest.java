package com.university.playing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueenTest {
    @Test
    public void toStringTest(){
        Queen queen=new Queen("white");
        Assertions.assertEquals("Qn",queen.toString());
    }
    @Test
    public void moveValidTest(){
        Queen queen1=new Queen("white");
        Assertions.assertTrue(queen1.moveValid(100, 49, 100, 52));
        Assertions.assertTrue(queen1.moveValid(100, 49, 103, 49));
        Assertions.assertTrue(queen1.moveValid(100, 49, 103, 52));
        Assertions.assertFalse(queen1.moveValid(100, 49, 97, 56));
    }
}
