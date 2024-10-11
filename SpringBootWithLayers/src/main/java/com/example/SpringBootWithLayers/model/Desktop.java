package com.example.SpringBootWithLayers.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    @Override
    public void code() {
        System.out.println("Compiling in a Desktop computer...");
    }
}
