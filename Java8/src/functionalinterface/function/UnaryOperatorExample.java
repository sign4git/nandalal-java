package functionalinterface.function;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unary = a -> a.concat("default");

    public static void main(String[] args) {
        System.out.println(unary.apply("hello"));
    }
}
