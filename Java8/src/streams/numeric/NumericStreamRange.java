package streams.numeric;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRange {

    public static void main(String[] args) {
        System.out.println("Int stream range count "+ IntStream.range(1,50).count());
        IntStream.range(1,50).forEach(n-> System.out.print(n+","));
        System.out.println();
        System.out.println("Int stream range close count "+ IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(n-> System.out.print(n+","));
        System.out.println();
        System.out.println("Long stream range count "+ LongStream.range(1,50).count());
        LongStream.range(1,50).forEach(n-> System.out.print(n+","));
        System.out.println();
        System.out.println("Long stream range close count "+ LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(n-> System.out.print(n+","));
        System.out.println();

        IntStream.range(1,50).asDoubleStream().forEach(n-> System.out.print(n+","));
        System.out.println();
    }
}
