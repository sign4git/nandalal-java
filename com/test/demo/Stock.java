package com.test.demo;

public class Stock {
    int price;
    long outStandingShare;
    String companyName;

    public Stock(int price, long outStandingShare, String companyName) {
        this.price = price;
        this.outStandingShare = outStandingShare;
        this.companyName = companyName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getOutStandingShare() {
        return outStandingShare;
    }

    public void setOutStandingShare(long outStandingShare) {
        this.outStandingShare = outStandingShare;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "price=" + price +
                ", outStandingShare=" + outStandingShare +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
