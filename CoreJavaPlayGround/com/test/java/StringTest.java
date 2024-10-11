package com.test.java;

public class StringTest {
    String s1=new String("test1");
    String s2="test1";

    public void showStringAddress(){
        System.out.println(s1==s2);
        System.out.println(s2.hashCode());
    }
}
