import java.util.Comparator;

public class ComparatorUsingLambda {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
        Integer a=comparator.compare(4,3);
        System.out.println(a);
    }
}
