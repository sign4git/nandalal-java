package org.example;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private Laptop myLaptop;
    private int warrantyYears;

    @ConstructorProperties({"age","warrantyYears","myLaptop"})
    public Alien(int age, int warrantyYears, Laptop myLaptop) {
        this.age = age;
        this.warrantyYears = warrantyYears;
        this.myLaptop = myLaptop;
    }

    public Alien(Laptop myLaptop, int age) {
        this.age = age;
        this.myLaptop = myLaptop;
    }

    public Alien(){
        System.out.println("Alien object created");
    }
    public void code(){
        System.out.println("Coding");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Alien setter setAge called");
        this.age = age;
    }

    public Laptop getMyLaptop() {
        return myLaptop;
    }

    public void setMyLaptop(Laptop myLaptop) {
        this.myLaptop = myLaptop;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "age=" + age +
                ", myLaptop=" + myLaptop +
                ", warrantyYears=" + warrantyYears +
                '}';
    }


}
