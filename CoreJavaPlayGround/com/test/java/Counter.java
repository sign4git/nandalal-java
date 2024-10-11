package com.test.java;

public class Counter {
    private int count;
    public synchronized void count(){
        this.count++;
    }

    public int getCount() {
        return count;
    }

}
