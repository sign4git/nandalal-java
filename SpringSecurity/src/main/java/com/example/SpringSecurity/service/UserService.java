package com.example.SpringSecurity.service;

import com.example.SpringSecurity.config.SecurityConfig;
import com.example.SpringSecurity.model.User;
import com.example.SpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    SecurityConfig securityConfig;

    @Autowired
    UserRepository userRepository;

    public User save(User user){
        user.setPassword(securityConfig.getPasswordEncoder().encode(user.getPassword()));
        return userRepository.save(user);
    }
}
