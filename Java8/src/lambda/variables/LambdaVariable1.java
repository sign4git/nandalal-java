package lambda.variables;

import java.util.function.Consumer;

public class LambdaVariable1 {
    public static void main(String[] args) {
        int var =1;
        Consumer<Integer> c1 = (i) ->{
            //not allowed to use same local variable name as lambda param or inside
            //lambda body
            //also not allowed to reassign value to local var
//            var=1;
//            int var=10;
            System.out.println(var+i);
        };
        c1.accept(4);
    }
}
