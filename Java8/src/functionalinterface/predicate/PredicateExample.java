package functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> isEven = a -> a%2==0;
    static Predicate<Integer> isDivBy5 = b -> b%5==0;

    public static void main(String[] args) {
        predicateIsEven();
        predicateIsDivBy5();
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

    private static void predicateIsEven() {
        System.out.println(isEven.test(4));
    }

    private static void predicateIsDivBy5(){
        System.out.println(isDivBy5.test(10));
    }

    private static void predicateAnd(){
        System.out.println(isEven.and(isDivBy5).test(10));
        System.out.println(isEven.and(isDivBy5).test(9));
    }

    private static void predicateOr(){
        System.out.println(isEven.or(isDivBy5).test(5));
        System.out.println(isEven.or(isDivBy5).test(10));
    }

    private static void predicateNegate(){
        System.out.println(isEven.or(isDivBy5).negate().test(10));
    }
}
