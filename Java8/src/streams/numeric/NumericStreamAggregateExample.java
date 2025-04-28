package streams.numeric;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        int summation = IntStream.rangeClosed(1,50).sum();
        System.out.println(summation);

//        max/min/avg

        OptionalInt optionalInt = IntStream.rangeClosed(1,50).max();
        System.out.println(optionalInt.isPresent()?optionalInt.getAsInt():0);

        OptionalLong optionalLong = LongStream.rangeClosed(1,50).min();
        System.out.println(optionalLong.isPresent()?optionalLong.getAsLong():0);

        OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();
        System.out.println(optionalDouble.getAsDouble());

    }
}
