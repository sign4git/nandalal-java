package streams.numeric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamExample {

    public static List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7);

    public static int sumOfNumbers(){
        return intList.stream()
                .reduce(0,(a,b)->a+b);
    }

    public static int sumOfNumbersUsingStream(){
        return IntStream.rangeClosed(1,7)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("sum using list of integer "+sumOfNumbers());
        System.out.println("sum using intstream "+sumOfNumbersUsingStream());
    }
}
