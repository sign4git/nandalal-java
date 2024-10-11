package com.test.java;

public class BallPointPen implements Pen{
    @Override
    public void write(int price, String dateOfManufacture) {
        System.out.println("A ball point pen writes"+" price:: "+price+" date of manufacture:: "+dateOfManufacture);
    }
}
