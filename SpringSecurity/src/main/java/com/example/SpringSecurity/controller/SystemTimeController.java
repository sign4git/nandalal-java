package com.example.SpringSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SystemTimeController {

    @GetMapping("/time")
    public ResponseEntity<String> getCurrentTime(HttpServletRequest req){
        return new ResponseEntity<>(new Date().toString()+" jsession id : "+
                req.getSession().getId(), HttpStatus.OK);
    }
}
