package parallel.stream;

import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

    public static void sequentialSum(){
        long startTime = System.currentTimeMillis();
        int sum = IntStream.rangeClosed(1,100_000)
                .boxed()
                .reduce(0,(x,y)->x+y);
        System.out.println("sum is "+ sum);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for sequential operation " +(endTime-startTime));
    }

    public static void parallelSum(){
        long startTime = System.currentTimeMillis();
        int sum = IntStream.rangeClosed(1,100_000)
                .boxed()
                .parallel()
                .reduce(0,(x,y)->x+y);
        System.out.println("sum is "+ sum);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for parallel operation "+(endTime-startTime));
    }

    public static void main(String[] args) {
        sequentialSum();
        parallelSum();
    }
}
