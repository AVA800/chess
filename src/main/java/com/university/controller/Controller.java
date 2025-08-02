package com.university.controller;

import com.university.dto.ChessRequest;
import com.university.playing.Pieces;
import com.university.playing.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chess")
public class Controller {
    @Autowired
    Table table;

    @GetMapping("/table")
    public ResponseEntity<String> layout2() {
        return ResponseEntity.status(200).body(table.layout2());
    }

    @PostMapping("/appliedMovement")
    public ResponseEntity<String> play(@RequestBody ChessRequest x) {
        if(table.movement(x.getFirstPosition(),x.getFinalPosition()).equals("valid")){
            return ResponseEntity.status(200).body(table.layout2());
        } else{return ResponseEntity.status(400).body(table.layout2());}
        }
    }

