package com.example.EcomSpringBoot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String category;
    private Date releaseDate;
    private String name;
    private String brand;
    private String description;
    private BigDecimal price;
    private boolean productAvailable;
    private Integer stockQuantity;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;
}
