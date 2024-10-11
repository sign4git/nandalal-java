package com.test.java;

public class StaticBlock {
    String name;
    int rollNo;
    static String schoolName;//jj

    public StaticBlock(String name, int rollNo) {
        this.name = "DefaultName";
        this.rollNo = 0;

        // this is not the right way if your static variable is going to be common across all instance of class
        this.schoolName="DEFAULT SCHOOL";

        System.out.println("This constructor gets called and it always initializes static var");
    }

    static{
        schoolName="DEFAULT STATIC";
        System.out.println("This is static block and is called only once either during object creation implicitly" +
                " or during explicit class loading");
    }
}
