package com.test.java;

public class VeryAdvCalc extends AdvCalc{
    public VeryAdvCalc(){
        System.out.println("This is constructor of level 3 class VeryAdvCalc.java");
    }

    public VeryAdvCalc(int randomNumber){
         this();
        System.out.println("I am in parameterized constructor");
    }

    public void testMethod(){
        System.out.println("test method of VeryAdvCalc.java");
        super.testMethod();
    }


}
