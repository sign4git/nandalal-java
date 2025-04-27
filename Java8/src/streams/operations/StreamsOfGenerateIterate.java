package streams.operations;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsOfGenerateIterate {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("van der sar","ferdinand",
                "scholes","rooney","ronaldo");
        stringStream.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.iterate(2,i->i*2)
                .limit(5);
        integerStream.forEach(System.out::println);

        Supplier<Integer> s1 = new Random()::nextInt;
        Stream<Integer> integerStream1 = Stream.generate(s1)
                .limit(5);
        integerStream1.forEach(System.out::println);
    }
}
