package com.test.java;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, CustomException, InterruptedException {
        //1. String Test
        // StringTest st = new StringTest();
        // st.showStringAddress();


        //2. String Buffer and Builder Test
        //StringBufferBuilderTest sbt = new StringBufferBuilderTest();
        //sbt.show();

        //3. Static Variable
//        StaticVariable sv1 = new StaticVariable();
//        sv1.show();
//        sv1.name="student one";
//        sv1.rollNo=1;
//        sv1.schoolName="modified";
//        sv1.show();
//
//        StaticVariable sv2 = new StaticVariable();
//        sv2.name="student two";
//        sv2.rollNo=2;
//        sv2.show();
//
//        StaticVariable.schoolName="STATIC SCHOOL";
//        sv2.show();


        //4. Static Methods
//        StaticMethods sm = new StaticMethods();
//        sm.name="student one";
//        sm.rollNo=1;
//        sm.schoolName="modified";
//        sm.show();
//        sm.staticShowMethod(sm);//one way to invoke static method. not used generally and not the right approach
//        StaticMethods.schoolName="DEFAULT SCHOOL";
//        StaticMethods.staticShowMethod(sm);//ideal way to invoke static method

        //5. Static Block
//        StaticBlock sb = new StaticBlock("NAME",2);
//        StaticBlock sb2= new StaticBlock("name2",3);
        //Suppose you want to initialize static block without using object creation do as below
//        Class.forName("com.test.java.StaticBlock");


        //6. Encapsulation
//        Encapsulation en = new Encapsulation();
//        System.out.println(en.toString());
//        en.setAge(20);
//        en.setName("DEFAULTNAME");
//        System.out.println(en.getAge());
//        System.out.println(en.getName());
//        System.out.println(en.toString());

        //7.Constructor
//        Constructor co = new Constructor();
//        Constructor co1= new Constructor(2,"This is some name");

        //8.Demo
//        VeryAdvCalc vac= new VeryAdvCalc();
//        VeryAdvCalc constWithParamTest = new VeryAdvCalc(2);
//        constWithParamTest.testMethod();

        //9.Package - Access Modifiers
//        PackageTest pt = new PackageTest();
//        System.out.println(pt.name+": "+pt.age+" :"+pt.yearOfJoining);
//        ProtectedSubclass psc= new ProtectedSubclass();
//        psc.show();

        //10. RUNTIME Polymorphism
//        A a = new A();
//        a.show();
//        a=new B(0);
//        a.show();

        //11. Test object methods using a class
//        Laptop lap= new Laptop();
//        System.out.println(lap);//internally calls toString of object
//        System.out.println(lap.toString());

        //12. UPCASTING
//        A a =(A) new B();
//        a.show();
//        //DOWNCASTING
//        B b = (B) a;
//        b.show();

        //13.AUTO BOXING
//        int num=7;
//        Integer val = new Integer(num);//this is called boxing
//        System.out.println(val);
//        val=Integer.valueOf(num);
//        System.out.println(val);
//        val=num;//this is called autoboxing
//        System.out.println(val);

        //14. AUTO-UNBOXING
//        Integer val =7;
//        int num = Integer.valueOf(val);//unboxing
//        System.out.println(num);
//        num= val;//auto-unboxing
//        System.out.println(num);

        //15.ABSTRACT CLASS
//        Car car = new WagonR();
//        car.drive();
//        car.start();

        //16.Non static Inner Class
//        OuterClass outerClass = new OuterClass();
//        outerClass.show();
//        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
//        innerClass.config();

        //17. Static inner class
//        OuterClass.InnerClassTwo innnerClassTwo = new OuterClass.InnerClassTwo();
//        innnerClassTwo.staticConfig();

        //18. Anonymous inner class
//        A obj= new A(){
//            public void show(){
//                System.out.println("i am in anonymous inner class");
//            }
//        };
//        obj.show();

        //19. Anonymous abstract inner class
//        Car lamborghini = new Car() {
//            @Override
//            void drive() {
//                System.out.println("i am in lamborghini car");
//            }
//        };
//        lamborghini.drive();
//        lamborghini.start();

        //20. Interface
//        Desktop desk = new Desktop();
//        Workstation workstation = new Workstation();
//        Developer dev = new Developer();
//        dev.devApp(workstation);


        //21. ENUMERATIONS
//        Status s = Status.Success;// each constant are object of status
//        System.out.println(s);
//        System.out.println(s.values());//prints all values of enum constants
//        System.out.println(s.ordinal());//prints index
//        Arrays.asList(s.values()).forEach(stat-> System.out.println(stat));
//
//        if(s==Status.Success)
//            System.out.println("successful");
//
//        switch(s){
//            case Success:
//                System.out.println("case successful");
//                break;
//            default:
//                System.out.println("default");
//        }

        //22. ENUMERATIONS WITH GETTERS AND SETTERS
//        LaptopBrand laptopBrand = LaptopBrand.DELL;
//        System.out.println(laptopBrand.getPrice());

        //23. Functional interfaces
//        Pen pen = new BallPointPen();
//        pen.write(10,"11-10-2010");
//        pen = new Pen() {
//            @Override
//            public void write(int price, String dateOfManufacture) {
//                System.out.println("A ball point pen writes"+" price:: "+price+" date of manufacture:: "+dateOfManufacture);
//            }
//        };
//        pen.write(30,"11-10-2023");
//        pen = (price, dateOfManufacture) -> System.out.println("Price:: " + price+" Date of manufacture:: "+dateOfManufacture);
//        pen.write(40,"11-10-2024");

        //24. Functional interfaces - Lambda Expression with return
//        Price laptop = new PriceOfAnItem();
//        System.out.println(laptop.getBuyingPrice(50000,500,100));
//        Price oldLaptop =  new Price() {
//            private int price;
//            @Override
//            public int getBuyingPrice(int price , int tax, int commission) {
//                this.price = price;
//                return this.price+tax+commission;
//            }
//        };
//        System.out.println(oldLaptop.getBuyingPrice(40000,400,100));
//        Price macbook = (price,tax,commission)-> price+tax+commission;
//        System.out.println(macbook.getBuyingPrice(100000,10000,1000));


        //25. EXCEPTION
//        try{
//            int zero=0;
//            int num = 23/zero;
//        }catch(ArithmeticException e){
//            System.out.println("in arithmetic exception");
//        }catch(NullPointerException e){
//            System.out.println("in null pointer exception");
//        }catch (Exception e){
//            System.out.println("In generic exception");
//        }

        //26. User defined exception
//        try{
//            int zero=0;
//            if(zero==0){
//                throw new CustomException("You cannot divide by zero");
//            }
//            int num = 23/zero;
//        }catch(CustomException e){
//            throw new CustomException("You cannot divide by zero");
//        }
//        catch(ArithmeticException e){
//            System.out.println("in arithmetic exception");
//        }catch(NullPointerException e){
//            System.out.println("in null pointer exception");
//        }catch (Exception e){
//            System.out.println("In generic exception");
//        }

        //27. Thread
//            PrintHi hi = new PrintHi();
//            PrintHello hello = new PrintHello();
//            hi.start();
//            hello.start();


        //28. Thread with Runnable
//        Runnable hi = new PrintHiRunnable();
//        Runnable hello = new PrintHelloRunnable();
//       Thread t1 = new Thread(hi);
//       Thread t2 = new Thread(hello);
//       t1.start();
//       t2.start();

        //29. Count - Thread safe
//        Counter count = new Counter();
//        Runnable r1= new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<10000;i++){
//                    count.count();
//                }
//            }
//        };
//        Runnable r2 = ()-> {
//            for(int i=0;i<10000;i++)
//                count.count();
//        };
//        Thread thread1 = new Thread(r1);
//        Thread thread2 = new Thread(r2);
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//        System.out.println(count.getCount());

        //30. Collections API

//        Collection<Integer> nums = new ArrayList();
//        nums.add(1);
//        nums.add(2);
//        nums.add(3);
//        int count=0;
//        for(Object i: nums){
//            System.out.println(i);
//            count=count+(Integer)(i);
//        }
//
//        System.out.println(nums);

        //ArrayList, Set, Treeset and Iterator
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(2);
//        list1.add(1);
//        list1.add(5);
//        list1.add(25);
//        list1.add(2);
//        System.out.println(list1.get(0));
//        System.out.println(list1);
//
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(11);
//        set1.add(2);
//        set1.add(1);
//        set1.add(5);
//        set1.add(25);
//        set1.add(2);
//        System.out.println(set1.contains(2));
//        System.out.println(set1);
//
//        Set<Integer> set2 = new TreeSet<>();
//        set2.add(11);
//        set2.add(2);
//        set2.add(1);
//        set2.add(5);
//        set2.add(25);
//        set2.add(2);
//        System.out.println(set2.contains(2));
//        System.out.println(set2);
//
//        Iterator<Integer> it = set2.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        //31. Maps
//        Map<String,Integer> map = new HashMap<>();
//        map.put("key",2);
//        Set<String> set =map.keySet();
//        System.out.println(set);
//
//        map = new Hashtable<>();
//        map.put("hashtable",2);
//        set =map.keySet();
//        System.out.println(set);

        //32. Comparator

//        Stock reliance = new Stock(2773,6767098793L,"Reliance");
//        Stock idfcFirstBank = new Stock(72,7061978022L,"IDFC First Bank");
//        Stock hclTech = new Stock(1782,2711464968L,"HCL Tech");
//        List<Stock> stockList = new ArrayList<>();
//        stockList.add(reliance);
//        stockList.add(idfcFirstBank);
//        stockList.add(hclTech);
//        Comparator<Stock> marketCapComparator = new Comparator<Stock>() {
//            @Override
//            public int compare(Stock o1, Stock o2) {
//                if(o1.getPrice()*o1.getOutStandingShare()>o2.getPrice()*o2.getOutStandingShare()){
//                    return 1;
//                }else{
//                    return -1;
//                }
//            }
//        };
//        Collections.sort(stockList,marketCapComparator);
////        stockList.sort(marketCapComparator);
//        System.out.println(stockList.toString());
////        System.out.println(stockList.reversed().toString());


        //33. Comparable

//        Batsman sachin = new Batsman(463,18426,"Sachin Tendulkar");
//        Batsman ponting = new Batsman(375,13704,"Ricky Ponting");
//        Batsman kohli = new Batsman(295,13906,"Virat Kohli");
//
//        List<Batsman> batsmanList = new ArrayList<>();
//        batsmanList.add(sachin);
//        batsmanList.add(ponting);
//        batsmanList.add(kohli);
//
//        Collections.sort(batsmanList);
//        System.out.println(batsmanList);

        //34. Stream API
//        List<Integer> sampleIntegerList = Arrays.asList(4,5,7,3,2,6);
////        sampleIntegerList.forEach(n-> System.out.println(n));
//        Integer finalSum = sampleIntegerList.stream()
//                .filter(n->n%2==0)
//                .map(n->n*2)
//                .reduce(0,(c,e)->c+e);
//        System.out.println(finalSum);
//        sampleIntegerList.stream().sorted().forEach(n-> System.out.println(n));
//        sampleIntegerList.stream().sorted().toList().reversed().stream().forEach(n-> System.out.println(n));
//        Integer finalSum2 = sampleIntegerList.stream()
//                .filter(n->n%2==0)
//                .mapToInt(n->n*2)
//                .sum();
//        System.out.println(finalSum2);
//        OptionalDouble averageOfList = sampleIntegerList.stream()
//                .filter(n->n%2==0)
//                .mapToInt(n->n)
//                .average();
//        System.out.println(averageOfList.getAsDouble());

        //35. Optional class

//        List<String> nameList = Arrays.asList("IDFC Bank","HDFC Bank","SBI Bank","Indian Bank","Reliance Industries Limited","Adani Enterprises");
//        Optional<String> nonBankingCompany=nameList.stream()
//                .filter(name->!name.contains("Bank"))
//                .findFirst();
//        System.out.println(nonBankingCompany.orElse("All are banks"));

        //36. Method Reference
//        Batsman sachin = new Batsman(463,18426,"Sachin Tendulkar");
//        Batsman ponting = new Batsman(375,13704,"Ricky Ponting");
//        Batsman kohli = new Batsman(295,13906,"Virat Kohli");
//
//        List<Batsman> batsmanList = new ArrayList<>();
//        batsmanList.add(sachin);
//        batsmanList.add(ponting);
//        batsmanList.add(kohli);
//
//        System.out.println(batsmanList.stream()
//                .map(Batsman::getName)
//                .sorted().toList());

        //37. Constructor Reference

        //dravid : 344 matches , 10889 runs
//        @FunctionalInterface
//        interface TriFunction<T,U,V,R>{
//                R apply(T t , U u, V v);
//        }
//
//        TriFunction<Integer, Integer, String , Batsman > batsmanConstructor = Batsman::new;
//        Batsman dravid = batsmanConstructor.apply(344,10889, "Rahul Dravid");
//        System.out.println(dravid.introduce());

        //38. Parallel Stream

//        int size=1000_0000;
//        List<Integer> nums = new ArrayList<>();
//        Random rand = new Random();
//        for(int i=0;i<size;i++)
//            nums.add(rand.nextInt(100));
//
//        long streamStart = System.currentTimeMillis();
//        int streamSum = nums.stream()
//                .map(n->n*2)
//                .mapToInt(n->n)
//                .sum();
//        long streamEnd = System.currentTimeMillis();
//        long streamDiff = streamEnd-streamStart;
//        System.out.println("Stream sum: "+streamSum+" Time Taken: "+streamDiff);
//
//        long parallelStreamStart = System.currentTimeMillis();
//        int parallelStreamSum=nums.parallelStream()
//                .map(n->n*2)
//                .mapToInt(n->n)
//                .sum();
//
//        long parallelStreamEnd = System.currentTimeMillis();
//        long parallelStreamDiff = parallelStreamEnd-parallelStreamStart;
//        System.out.println("Parallel Stream sum: "+parallelStreamSum+" Time Taken: "+parallelStreamDiff);




    }
}
