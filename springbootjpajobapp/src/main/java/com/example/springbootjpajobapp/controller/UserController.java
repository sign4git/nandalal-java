package com.example.springbootjpajobapp.controller;

import com.example.springbootjpajobapp.model.User;
import com.example.springbootjpajobapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> userList = userService.getAllUsers();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @PostMapping("user")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User response = userService.save(user);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }
}
