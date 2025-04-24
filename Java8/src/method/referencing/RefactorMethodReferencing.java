package method.referencing;

import functionalinterface.datamodel.Student;

import java.util.Arrays;
import java.util.function.Predicate;

public class RefactorMethodReferencing {
    static Student student= new Student("name",2,3.5,
            "male", Arrays.asList("cricket","golf"));
    static Predicate<Student> p1 = RefactorMethodReferencing::getGradeLevel;
    static boolean getGradeLevel(Student s){
        return s.getGradeLevel()>=3;
    }
    public static void main(String[] args) {
        System.out.println(p1.test(student));
    }
}
