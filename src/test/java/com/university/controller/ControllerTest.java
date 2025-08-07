package com.university.controller;

import com.university.dto.ChessRequest;
import com.university.playing.Table;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ControllerTest {
    @Test
    public void layout2Test(){
        Table table= Mockito.mock(Table.class);
        Mockito.when(table.layout2()).thenReturn("mock table");
        Controller controller=new Controller();
        controller.table=table;
      //  Assertions.assertEquals(HttpStatus.OK,controller.layout2().getStatusCode());
        Assertions.assertEquals("mock table",controller.layout2().getBody());
    }

    @Test
    public void playTest(){
        ChessRequest chessRequest= new ChessRequest();
        Table table= Mockito.mock(Table.class);
        Mockito.when(table.movement(Mockito.any(),Mockito.any())).thenReturn("valid");
        Controller controller=new Controller();
        controller.table=table;
        Assertions.assertEquals(HttpStatus.valueOf(200),controller.play(chessRequest).getStatusCode());

        Mockito.when(table.movement(Mockito.any(),Mockito.any())).thenReturn("no valid");
        Assertions.assertEquals(HttpStatus.valueOf(400),controller.play(chessRequest).getStatusCode());

    }
}

