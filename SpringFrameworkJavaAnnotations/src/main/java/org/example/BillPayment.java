package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BillPayment {

    @Value("1117.0")
    private double billAmount;

    @Autowired
    @Qualifier("iciciVisa")
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
