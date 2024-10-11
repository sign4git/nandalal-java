package com.test.java;

public class StaticVariable {
    String name;
    int rollNo;
    static String schoolName="DefaultSchool";

    public void show(){
        System.out.println("Name: "+name);
        System.out.println("rollNo: "+rollNo);
        System.out.println("schoolName: "+schoolName);
    }
}
