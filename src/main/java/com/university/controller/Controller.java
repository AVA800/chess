package com.university.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chess")
public class Controller {
    @GetMapping("/movePiece")
    public String movePiece(){
      return "moving";
    }
}
