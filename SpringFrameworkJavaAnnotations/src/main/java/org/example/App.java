package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("This is end of Application context");
        //1. GET BEAN BY TYPE
//        Laptop laptop = context.getBean(Laptop.class);
//        System.out.println(laptop.toString());

        //2. GET BEAN BY NAME. This name is based on method name in AppConfig.java
//        Laptop laptopByBeanName = context.getBean("laptop1", Laptop.class);
//        System.out.println(laptopByBeanName.toString());

        //3. Check Multiple Bean of same Class with Different Method Name in AppConfig
        //Done along with Step 2
//        Laptop checkMultiLaptopBeanWithDiffName = context.getBean("laptop2", Laptop.class);
//        System.out.println(checkMultiLaptopBeanWithDiffName.toString());

        //4. Check Bean with User Defined Name using @Bean rather than method name
//        Laptop checkUserDefinedBeanAnnotation = context.getBean("dell", Laptop.class);
//        System.out.println(checkUserDefinedBeanAnnotation.toString());
//        Laptop checkUserDefinedBeanAnnotation2 = context.getBean("samsung", Laptop.class);
//        System.out.println(checkUserDefinedBeanAnnotation2.toString());
//        System.out.println(checkUserDefinedBeanAnnotation.toString());

        //5. Autowiring Dependencies
        BillPayment billPayment = context.getBean(BillPayment.class);
        System.out.println(billPayment.toString());


    }
}
