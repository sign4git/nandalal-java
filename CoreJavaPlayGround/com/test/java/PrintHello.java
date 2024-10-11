package com.test.java;

public class PrintHello extends Thread{
    public void run(){
        for(int i=0; i< 100 ; i++)
            System.out.println("Hello");
    }
}
