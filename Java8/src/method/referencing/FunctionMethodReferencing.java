package method.referencing;

import java.util.function.Function;

public class FunctionMethodReferencing {
    static Function<String,String> f1 = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(f1.apply("test"));
    }
}
