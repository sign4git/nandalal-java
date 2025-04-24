package constructor.referencing;

import functionalinterface.datamodel.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferencingExample {
    static Supplier<Student> simpleConstructor = Student::new;
    static Function<String,Student> constructorWithName = Student::new;
    public static void main(String[] args) {
        System.out.println(simpleConstructor.get());
        System.out.println(constructorWithName.apply("wayne"));
    }
}
