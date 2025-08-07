package com.university.playing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BishopTest {
    @Test
    public void toStringTest(){
        Bishop bishop=new Bishop("white");
        Assertions.assertEquals("Bi",bishop.toString());
    }
    @Test
    public void moveValidTest(){
        Bishop bishop=new Bishop("black");
        Assertions.assertEquals(true,bishop.moveValid(99,49,101,51));
        Assertions.assertEquals(false,bishop.moveValid(99,49,101,52));
    }


}
