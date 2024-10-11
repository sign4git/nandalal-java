package com.test.java;

public enum LaptopBrand {
    MACBOOK(20000),DELL(18000),HP(17500),LENOVO(15000),ASUS(15000);
    private int price;
    //Enum constructors are private always
    LaptopBrand(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
