package org.example;

public class BillPayment {
    private double billAmount;
    private CreditCard creditCard;

    public BillPayment(){
        System.out.println("This is default constructor for BillPayment");
    }

    public BillPayment(double billAmount, CreditCard creditCard) {
        this.billAmount = billAmount;
        this.creditCard = creditCard;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        creditCard.CardInfo();
        return "BillPayment{" +
                "billAmount=" + billAmount +
                ", creditCard=" + creditCard +
                '}';
    }
}
