package com.university.playing;

import com.university.playing.Rook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RookTest {
    @Test
    public void toStringTest() {
        Rook rook = new Rook("black");
        Assertions.assertEquals("Rk", rook.toString());
    }

    @Test
    public void moveValidTest() {
        Rook rook1 = new Rook("white");
        Assertions.assertEquals(true, rook1.moveValid(97, 49, 97, 51));


        Assertions.assertEquals(true, rook1.moveValid(97, 49, 98, 49));

        Assertions.assertEquals(false, rook1.moveValid(97, 49, 98, 50));
    }
}



