package com.example.SpringSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    public ResponseEntity<String> greet(HttpServletRequest req){
        return new ResponseEntity<>("Hello World . JSession id : "+
                req.getSession().getId(), HttpStatus.OK);
    }

}
