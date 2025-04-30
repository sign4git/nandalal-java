package parallel.stream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkExecutionTime(int iterations, Supplier<Integer> supplier){

        long startTime = System.currentTimeMillis();
        for(int i=0;i<iterations;i++){
           supplier.get();
       }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

    public static int sumSequentialStream(){
        return IntStream.rangeClosed(1,1000000).sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(1,1000000).parallel().sum();
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential stream execution time : "+checkExecutionTime(20,ParallelStreamExample::sumSequentialStream));
        System.out.println("Parallel stream execution time : "+checkExecutionTime(20,ParallelStreamExample::sumParallelStream));
    }
}
