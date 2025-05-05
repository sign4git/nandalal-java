package defaultstatic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultStaticExample {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Antonio","Berbatov","Chicharito","Zlatan",
                "Rooney","Rashford","Carrick");
//        Collections.sort(stringList);

        System.out.println(stringList);
        stringList.sort(Comparator.naturalOrder());

        System.out.println("sort natural order "+ stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("sort reverse order "+ stringList);


    }
}
