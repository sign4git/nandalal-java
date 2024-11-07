package com.example.springbootjpajobapp.service;

import com.example.springbootjpajobapp.config.SecurityConfig;
import com.example.springbootjpajobapp.model.User;
import com.example.springbootjpajobapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    SecurityConfig securityConfig;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User save(User user) {
        user.setPassword(securityConfig.getPasswordEncoder().encode(user.getPassword()));
        return userRepository.save(user);
    }
}
