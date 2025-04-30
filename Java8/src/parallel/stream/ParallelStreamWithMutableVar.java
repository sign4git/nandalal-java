package parallel.stream;

import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ParallelStreamWithMutableVar {
    public static void main(String[] args) {
        Sum sum = new Sum();
        Consumer<Integer> consumer = a -> sum.performSum(a);
        IntStream.rangeClosed(1,1000).boxed()
                .forEach(consumer);
        System.out.println(sum.getTotal());


//        Since the value total in sum class is mutable, the resulting sum varies each time it is calculated.
        Sum parallelSum = new Sum();
        Consumer<Integer> parallelConsumer = a -> parallelSum.performSum(a);
        IntStream.rangeClosed(1,1000).boxed()
                .parallel()
                .forEach(parallelConsumer);
        System.out.println(parallelSum.getTotal());
    }
}
