package function;

import java.util.function.Function;

public class FunctionExample {
    static Function<String,String> doUpperCase = a -> a.toUpperCase();
    static Function<String,String> addString = a -> a.toUpperCase().concat("default");
    public static void main(String[] args) {
        System.out.println(doUpperCase.apply("sample"));
        System.out.println(addString.apply("sample"));
        System.out.println(doUpperCase.andThen(addString).apply("sample"));
        System.out.println(doUpperCase.compose(addString).apply("sample"));
    }
}
