package com.university.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.university.playing.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChessRequest {
    public String firstPosition;
    public String finalPosition;
    public String permission;

    public ChessRequest(){};
    public ChessRequest(String pos1, String pos2){
        firstPosition=pos1;
        finalPosition=pos2;
    }
}

