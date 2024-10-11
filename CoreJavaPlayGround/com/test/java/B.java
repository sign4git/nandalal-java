package com.test.java;

import com.test.java.A;

public class B extends A {
    private final int variable=2;
//    public B(){
//        System.out.println("in constructor B");
//    }
//    public B(int dummy){
//        this();
//        System.out.println("dummy constructor of B");
//    }
    @Override
    public void show() {
        System.out.println("in show B");
    }
}
