package consumer;

import java.util.function.Consumer;

public class ConsumerFunctionalInterfacePart1 {
    public static void main(String[] args) {
        Consumer<String> cons = a -> System.out.println(a.toUpperCase());
        cons.accept("consumer functional interface part 1");
//        "consumer functional interface part 1".toUpperCase();
    }
}
