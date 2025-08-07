package com.university.playing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KnightTest {
    @Test
    public void toStringTest(){
        Knight knight=new Knight("White");
        Assertions.assertEquals("Kn",knight.toString());
    }
    @Test
    public void moveValidTest(){
        Knight knight=new Knight("white");
        Assertions.assertEquals(true,knight.moveValid(98,49,99,51));
        Assertions.assertEquals(true,knight.moveValid(98,49,100,50));
        Assertions.assertEquals(false,knight.moveValid(98,49,100,51));

    }
}
