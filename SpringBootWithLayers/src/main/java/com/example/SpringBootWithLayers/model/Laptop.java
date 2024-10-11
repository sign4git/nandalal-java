package com.example.SpringBootWithLayers.model;

import com.example.SpringBootWithLayers.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{
    @Autowired
    LaptopService laptopService;

    @Override
    public void code() {
        System.out.println("Compiling using a Laptop computer");
    }

    public void addLaptop(){
        laptopService.addLaptop(this);
    }
}
