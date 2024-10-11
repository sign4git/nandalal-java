package org.example.config;

import org.example.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
//    @Bean
//    public Laptop laptop1(){
//        Laptop laptop = new Laptop();
//        laptop.setHardDiskMemory("1 TB");
//        laptop.setRamMemory("16 GB");
//        return laptop;
//    }
//
//    @Bean
//    public Laptop laptop2(){
//        Laptop laptop = new Laptop();
//        laptop.setHardDiskMemory("2 TB");
//        laptop.setRamMemory("32 GB");
//        return laptop;
//    }
//
//    @Scope("prototype")
//    @Bean({"acer","samsung","dell"})
//    public Laptop laptop(){
//        Laptop laptop = new Laptop();
//        laptop.setHardDiskMemory("512 GB");
//        laptop.setRamMemory("8 GB");
//        return laptop;
//    }
//
//    //when you just have one bean with multipleNames, when you get the bean by type. It will work
//    //when you specify method name in context.getbean , it should not have @Bean names. Otherwise use the name specified in bean annotation
//    @Bean({"hdfcVisaCard","iciciVisaCard"})
//    public BillPayment billPayment(@Qualifier("americanExpress") @Autowired CreditCard myCreditCard){
//        BillPayment billPayment = new BillPayment();
//        billPayment.setBillAmount(471.0);
//        billPayment.setCreditCard(myCreditCard);
//        return billPayment;
//    }
//
//    @Bean
//    @Primary
//    public Visa visa(){
//        Visa visa = new Visa();
//        visa.setCvvDigits(3);
//        visa.setMerchantFee(2.0);
//        return visa;
//    }
//
//    @Bean
//    public AmericanExpress americanExpress(){
//        AmericanExpress amex = new AmericanExpress();
//        amex.setCvvDigits(4);
//        amex.setMerchantFee(5.0);
//        return amex;
//    }
}
