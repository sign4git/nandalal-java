package defaultstatic;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    public static Consumer<Student> studentConsumer = System.out::println;

    public static void comparingNullFirst(List<Student> studentList){
        System.out.println("Before sort comparingNullFirst: ");
        studentList.forEach(studentConsumer);
        Comparator<Student> nameComparatorNullsFirst = Comparator.nullsFirst(Comparator.comparing(Student::getName));
        studentList.sort(nameComparatorNullsFirst);
        System.out.println("After sort comparingNullFirst: ");
        studentList.forEach(studentConsumer);
    }

    public static void comparingNullLast(List<Student> studentList){
        System.out.println("Before sort comparingNullLast: ");
        studentList.forEach(studentConsumer);
        Comparator<Student> nameComparatorNullsLast = Comparator.nullsLast(Comparator.comparing(Student::getName));
        studentList.sort(nameComparatorNullsLast);
        System.out.println("After sort comparingNullLast: ");
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList = StudentDataBase.getAllStudentsWithNull();
        comparingNullFirst(studentList);
        comparingNullLast(studentList);

    }
}
