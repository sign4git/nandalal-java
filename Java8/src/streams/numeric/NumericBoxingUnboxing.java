package streams.numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericBoxingUnboxing {

    public static List<Integer> boxingInt(){
        return IntStream.rangeClosed(1,50).boxed().collect(Collectors.toList());
    }

    public static List<Long> boxingLong(){
        return LongStream.rangeClosed(1,50).boxed().collect(Collectors.toList());
    }

    public static List<Double> boxingDouble(){
        return IntStream.rangeClosed(1,50).asDoubleStream().boxed().collect(Collectors.toList());
    }

    public static int unboxingInt(List<Integer> integerList){
        return integerList.stream().mapToInt(Integer::intValue).sum();
    }

    public static long unboxingLong(List<Long> longList){
        return longList.stream().mapToLong(Long::longValue).sum();
    }

    public static double unboxingDouble(List<Double> doubleList){
        return doubleList.stream().mapToDouble(Double::doubleValue).sum();
    }

    public static List<MyInteger> mapToObject(){
        return IntStream.rangeClosed(1,5).mapToObj(MyInteger::new)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Boxing Integer " + boxingInt());
        System.out.println("Boxing Long " + boxingLong());
        System.out.println("Boxing Double " + boxingDouble());

        System.out.println("unBoxing Integer " + unboxingInt(boxingInt()));
        System.out.println("unBoxing Long " + unboxingLong(boxingLong()));
        System.out.println("unBoxing Double " + unboxingDouble(boxingDouble()));

        System.out.println("mapto obj: " + mapToObject());
    }
}
