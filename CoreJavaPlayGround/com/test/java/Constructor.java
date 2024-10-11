package com.test.java;

public class Constructor {
    private int age;
    private String name;
    //

    public Constructor() {
        System.out.println("Calling constructor");
    }

    public Constructor(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("This is parameterized constructor with age: "+this.age+" name: "+this.name);
    }
}
