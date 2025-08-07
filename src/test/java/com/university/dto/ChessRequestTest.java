package com.university.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ChessRequestTest {
    @Test
    public void ChessRequestTest(){
    //    ChessRequest chessRequest =Mockito.mock(ChessRequest.class);
        ChessRequest chessRequest=new ChessRequest("a","b");
        //Mockito.when(chessRequest.ChessRequest(Mockito.any(),Mockito.any())).thenReturn("null");
        Assertions.assertEquals(ChessRequest.class,chessRequest.getClass());
    }
}

