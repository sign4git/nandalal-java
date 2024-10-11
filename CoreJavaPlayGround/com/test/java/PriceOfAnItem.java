package com.test.java;

public class PriceOfAnItem implements Price{
    private int price;

    @Override
    public int getBuyingPrice(int price, int tax, int commission) {
        this.price = price;
        return getPrice()+tax+commission;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
