package com.university.playing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KingTest {
    @Test
    public void toStringTest(){
        King king=new King("white");
        Assertions.assertEquals("Kg",king.toString());
    }
    @Test
    public void moveValidTest(){
        King king=new King("White");
        Assertions.assertEquals(true,king.moveValid(101,49,102,50));
        Assertions.assertEquals(false,king.moveValid(101,49,103,51));
        Assertions.assertEquals(true,king.moveValid(101,49,102,49));
        Assertions.assertEquals(true,king.moveValid(101,49,101,50));
        Assertions.assertEquals(false,king.moveValid(101,49,103,49));
        Assertions.assertEquals(false,king.moveValid(101,49,101,51));
    }
}
