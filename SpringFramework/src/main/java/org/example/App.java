package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("Dummy line");
        //1. looks for a matching object
//        Alien obj= context.getBean(Alien.class);
//        obj.code();

        //2. Though you call the same object twice, object creation happens once.
        //this is because the scope is singleton.
        // If you make scope prototype, then object gets created twice
        //when scope=prototype , object does not gets created during ApplicationContext
        //prototype scope object creation happens during getbean
//        Alien obj1 = (Alien) context.getBean("alien1");
//        obj1.code();
//
//        Alien obj2= (Alien) context.getBean("alien1");
//        obj2.code();

        //3. Setter injection - Primitive datatype
//        Alien setterInjectionObject = (Alien) context.getBean("setterAlien");
//        System.out.println(setterInjectionObject.getAge());

        //4. Setter Injection - Non-primitive datatype (reference -ref)
//        Alien nonPrimitiveDataType = (Alien) context.getBean("nonPrimitiveAlien");
//        System.out.println(nonPrimitiveDataType.getAge());
//        System.out.println(nonPrimitiveDataType.getMyLaptop().getRamMemory());
//        System.out.println(nonPrimitiveDataType.getMyLaptop().getHardDiskMemory());

        //5. Constructor Injection
//        Alien constructorInjectionObject = (Alien) context.getBean("constructorAlien");
//        System.out.println(constructorInjectionObject.toString());

        //6. Working with interface using properties
//        BillPayment billPaymentObjectUsingProperties = (BillPayment) context.getBean("billPaymentInterfaceUsingProperties");
//        System.out.println(billPaymentObjectUsingProperties.toString());

        //7. Working with interface using constructor
//        BillPayment billPaymentObjectUsingConstructor = (BillPayment) context.getBean("billPaymentInterfaceUsingConstructor");
//        System.out.println(billPaymentObjectUsingConstructor.toString());

        //8. Autowiring
//        BillPayment billPaymentAutowiring = (BillPayment) context.getBean("autowiringBillPayment");
//        System.out.println(billPaymentAutowiring.toString());

        //9. Lazy Init
//        AmericanExpress americanExpressLazy = (AmericanExpress) context.getBean("creditCard1");
//        americanExpressLazy.CardInfo();

        //10. Get Bean By Type(This way we can avoid typecast when we do context.getBean("")
//        AmericanExpress americanExpressObjectByType = context.getBean("creditCard1",AmericanExpress.class);
//        americanExpressObjectByType.CardInfo();
//        AmericanExpress americanExpressObjectGetByType1 = context.getBean(AmericanExpress.class);
//        americanExpressObjectGetByType1.CardInfo();
//        CreditCard getCreditCardByType = context.getBean(CreditCard.class);
//        getCreditCardByType.CardInfo();

        //11.Inner Bean
        BillPayment innerBeanBillPayment = context.getBean(BillPayment.class);
        System.out.println(innerBeanBillPayment.toString());

    }
}
