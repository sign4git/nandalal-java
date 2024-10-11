package com.test.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Stock reliance = new Stock(2773,6767098793L,"Reliance");
        Stock idfcFirstBank = new Stock(72,7061978022L,"IDFC First Bank");
        Stock hclTech = new Stock(1782,2711464968L,"HCL Tech");
        List<Stock> stockList = new ArrayList<>();
        stockList.add(reliance);
        stockList.add(idfcFirstBank);
        stockList.add(hclTech);
        Comparator<Stock> marketCapComparator = new Comparator<Stock>() {
            @Override
            public int compare(Stock o1, Stock o2) {
                if(o1.getPrice()*o1.getOutStandingShare()>o2.getPrice()*o2.getOutStandingShare()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Collections.sort(stockList,marketCapComparator);
//        stockList.sort(marketCapComparator);
        System.out.println(stockList.toString());
//        System.out.println(stockList.reversed().toString());

        Batsman sachin = new Batsman(463,18426,"Sachin Tendulkar");
        Batsman ponting = new Batsman(375,13704,"Ricky Ponting");
        Batsman kohli = new Batsman(295,13906,"Virat Kohli");

        List<Batsman> batsmanList = new ArrayList<>();
        batsmanList.add(sachin);
        batsmanList.add(ponting);
        batsmanList.add(kohli);

        Collections.sort(batsmanList);
        System.out.println(batsmanList);

    }
}
