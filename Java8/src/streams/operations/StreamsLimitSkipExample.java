package streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static List<Integer> intList = Arrays.asList(1,2,3,4,5);

    public static Optional<Integer> sumWithLimit(){
        return intList.stream()
                .limit(3)
                .reduce(Integer::sum);
    }

    public static Optional<Integer> sumWithSkip(){
        return intList.stream()
                .skip(3)
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {
        Optional<Integer> sumWithLimit = sumWithLimit();
        Optional<Integer> sumWithSkip = sumWithSkip();
        if(sumWithLimit.isPresent()){
            System.out.println("sum with limit is "+sumWithLimit.get());
        }else{
            System.out.println("No input passed");
        }

        if(sumWithSkip.isPresent()){
            System.out.println("sum with skip is "+sumWithSkip.get());
        }else{
            System.out.println("No input passed");
        }
    }
}
