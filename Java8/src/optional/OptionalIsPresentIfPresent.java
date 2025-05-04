package optional;

import java.util.Optional;

public class OptionalIsPresentIfPresent {

    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.ofNullable("My String");
        System.out.println(stringOptional.isPresent());
        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get());
        }else{
            System.out.println("String not found");
        }

        stringOptional.ifPresent(s-> System.out.println(s));
    }
}
