package functionalinterface.function;

public class FunctionExample2 {
    public static String doConcat(String str){
        return FunctionExample.addString.apply(str);
    }
    public static void main(String[] args) {
        String result = doConcat("Hello");
        System.out.println(result);
    }
}
