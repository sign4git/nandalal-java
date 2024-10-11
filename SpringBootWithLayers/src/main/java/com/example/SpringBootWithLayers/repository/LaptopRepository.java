package com.example.SpringBootWithLayers.repository;

import com.example.SpringBootWithLayers.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("Saving laptop in the DB");
    }
}
