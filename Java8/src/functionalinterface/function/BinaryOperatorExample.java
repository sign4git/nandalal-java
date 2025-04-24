package functionalinterface.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static BinaryOperator<Integer> binary = (a,b) -> a*b;
    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);


    public static void main(String[] args) {
        System.out.println(binary.apply(3,4));
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(maxBy.apply(3,5));
        System.out.println(minBy.apply(5,3));
    }
}
