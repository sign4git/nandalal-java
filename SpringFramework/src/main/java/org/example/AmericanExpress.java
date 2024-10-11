package org.example;

public class AmericanExpress implements CreditCard{
    private int cvvDigits;
    private double merchantFee;

    public AmericanExpress(){
        System.out.println("This is default constructor for AmericanExpress");
    }

    public AmericanExpress(int cvvDigits, double merchantFee) {
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
        return "AmericanExpress{" +
                "cvvDigits=" + cvvDigits +
                ", merchantFee=" + merchantFee +
                '}';
    }


    @Override
    public void CardInfo() {
        System.out.println("This is American Express card");
    }
}
