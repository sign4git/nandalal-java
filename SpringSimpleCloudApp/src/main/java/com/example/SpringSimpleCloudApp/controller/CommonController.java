package com.example.SpringSimpleCloudApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @GetMapping("/")
    public String greet(){
        return "Hello Cloud World!!!!";
    }

    @GetMapping("/info")
    public String aboutMachine(){
        String os = System.getProperty("os.name");
        String version = System.getProperty("os.version");
        String architecture = System.getProperty("os.arch");
        String javaVersion = System.getProperty("java.version");
        String username = System.getProperty("user.name");
        return String.
                format("Operating System: %s\nVersion: %s\nArchitecture: %s\nJava Version: %s\nUsername: %s", os, version, architecture,javaVersion,username);
    }
}
