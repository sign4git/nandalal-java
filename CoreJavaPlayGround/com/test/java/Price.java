package com.test.java;

@FunctionalInterface
public interface Price {
    public int getBuyingPrice(int price, int tax, int commission);
}
