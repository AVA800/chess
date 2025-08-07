package com.university.playing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PiecesTest {
    @Test
    public void moveValidTest(){
        Pieces pieces=new Pieces("white");
        Assertions.assertTrue(pieces.moveValid(99, 50, 99, 51));
    }
    @Test
    public void teamAssignedTest(){
        Pieces piece1=new Pieces("white");
        Pieces piece2=new Pieces("black");
        Assertions.assertEquals("white",piece1.teamAssigned(1));
        Assertions.assertEquals("empty",piece1.teamAssigned(3));
        Assertions.assertEquals("black",piece1.teamAssigned(7));


    }
}
