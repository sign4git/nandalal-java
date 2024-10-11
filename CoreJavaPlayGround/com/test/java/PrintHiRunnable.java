package com.test.java;

public class PrintHiRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0; i< 100 ; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1l);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
