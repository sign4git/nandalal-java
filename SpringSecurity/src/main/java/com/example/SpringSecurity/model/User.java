package com.example.SpringSecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "users")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    private Integer id;
    private String username;
    private String password;
}
