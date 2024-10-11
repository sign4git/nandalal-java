package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("iciciVisa")
public class Visa implements CreditCard{
    @Value("3")
    private int cvvDigits;
    @Value("1.0")
    private double merchantFee;

    public Visa(){
        System.out.println("This is default constructor for Visa");
    }

    public Visa(int cvvDigits, double merchantFee) {
        this.cvvDigits = cvvDigits;
        this.merchantFee = merchantFee;
    }

    public int getCvvDigits() {
        return cvvDigits;
    }

    public void setCvvDigits(int cvvDigits) {
        this.cvvDigits = cvvDigits;
    }

    public double getMerchantFee() {
        return merchantFee;
    }

    public void setMerchantFee(double merchantFee) {
        this.merchantFee = merchantFee;
    }

    @Override
    public String toString() {
        return "Visa{" +
                "cvvDigits=" + cvvDigits +
                ", merchantFee=" + merchantFee +
                '}';
    }

    @Override
    public void CardInfo() {
        System.out.println("This is VISA Card");
    }
}
