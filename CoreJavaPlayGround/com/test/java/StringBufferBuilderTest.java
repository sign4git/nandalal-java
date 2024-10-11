package com.test.java;

public class StringBufferBuilderTest {
    StringBuffer buffer=new StringBuffer("test");
    StringBuilder builder = new StringBuilder("test");
    public void show(){
        buffer.ensureCapacity(100);
        buffer.setLength(30);
        System.out.println("Buffer Capacity::"+buffer.capacity());
        System.out.println("Buffer Length::"+buffer.length());
        System.out.println("Builder Capacity::"+builder.capacity());
    }

}
