package com.test.java;

public class OuterClass {
    public void show(){
        System.out.println("I am in show method of outer class");
    }

    class InnerClass{
        public void config(){
            System.out.println("I am in config method of inner class");
        }
    }

    static class InnerClassTwo{
        public void staticConfig(){
            System.out.println("I am in static Config method of static inner class");
        }
    }
}
