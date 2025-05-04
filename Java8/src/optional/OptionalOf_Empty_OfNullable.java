package optional;

import java.util.Optional;

public class OptionalOf_Empty_OfNullable {

    public static Optional<String> ofNullable(){
        return Optional.ofNullable("Hello");//accepts null
    }

    public static Optional<String> of(){
        return Optional.of("Hello");//used when there is an object present always
    }

    public static Optional<String> empty(){
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println(ofNullable());
        System.out.println(of());
        System.out.println(empty());
        System.out.println(empty().isPresent());
    }
}
