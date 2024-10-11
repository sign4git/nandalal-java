package com.example.SpringBootWithLayers.service;

import com.example.SpringBootWithLayers.model.Laptop;
import com.example.SpringBootWithLayers.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    LaptopRepository laptopRepository;
    public void addLaptop(Laptop lap){
        laptopRepository.save(lap);
    }
}
