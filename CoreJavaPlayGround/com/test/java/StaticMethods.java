package com.test.java;

public class StaticMethods {
    String name;
    int rollNo;
    static String schoolName="DefaultSchool";

    public void show(){
        System.out.println("In Non-Static Method");
        System.out.println("Name: "+name);
        System.out.println("rollNo: "+rollNo);
        System.out.println("schoolName: "+schoolName);
        System.out.println("End of non static method");
    }

    //Non static variables can't be accessed directly in static method.
    // To do so, use as below. Pass an instance of the class
    public static void staticShowMethod(StaticMethods sm){
        System.out.println("In Static Method");
        System.out.println("Name: "+sm.name);
        System.out.println("rollNo: "+sm.rollNo);
        System.out.println("schoolName: "+schoolName);
        System.out.println("End of static method");
    }
}
