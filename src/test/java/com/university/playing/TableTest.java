package com.university.playing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TableTest {
    @Test
    public void movementTest(){
        //First movement-valid
        Table table=new Table();
        table.layout1();
        Assertions.assertEquals("valid",table.movement("a2","a3"));
        table.layout2();
        //Second movement-valid
        Assertions.assertEquals("valid",table.movement("a1","a7"));
        table.layout2();
        //Third movement-no valid
        Assertions.assertEquals("no valid",table.movement("b8","d7"));
        table.layout2();
        //Fourth movement-no valid
        Assertions.assertEquals("no valid",table.movement("h2","a2"));
        table.layout2();
    }
}
