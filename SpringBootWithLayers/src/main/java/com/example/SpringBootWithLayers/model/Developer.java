package com.example.SpringBootWithLayers.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {
    private int age;

    @Autowired
    private Computer myComputer;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getMyComputer() {
        return myComputer;
    }

    public void setMyComputer(Computer myComputer) {
        this.myComputer = myComputer;
    }

    public void compile(){
        myComputer.code();
    }
}
