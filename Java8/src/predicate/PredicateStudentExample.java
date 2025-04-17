package predicate;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    public static Predicate<Student> printGradeAboveThree = a -> a.getGradeLevel()>=3;
    public static Predicate<Student> printGradeAbove3_9 = a -> a.getGpa()>=3.9;
    static List<Student> studentList = StudentDataBase.getAllStudents();


    public static void main(String[] args) {
        printGradeGreaterThan3();
        printGpaGreaterThan3_9();
        printGpaGreaterThan3_9AndGradeGreaterThan3();
        printGpaGreaterThan3_9OrGradeGreaterThan3();
        printStudentGpaNotGreaterThan3_9OrGradeNotGreaterThan3();
    }

    private static void printStudentGpaNotGreaterThan3_9OrGradeNotGreaterThan3() {
        System.out.println("printStudentGpaNotGreaterThan3_9OrGradeNotGreaterThan3");
        studentList.forEach(student -> {
            if(printGradeAboveThree.or(printGradeAbove3_9).negate().test(student)){
                System.out.println(student);
            }
        });
    }

    private static void printGpaGreaterThan3_9OrGradeGreaterThan3() {
        System.out.println("printGpaGreaterThan3_9OrGradeGreaterThan3");
        studentList.forEach(student -> {
            if(printGradeAboveThree.or(printGradeAbove3_9).test(student)){
                System.out.println(student);
            }
        });
    }

    private static void printGpaGreaterThan3_9AndGradeGreaterThan3() {
        System.out.println("printGpaGreaterThan3_9AndGradeGreaterThan3");
        studentList.forEach(student -> {
            if(printGradeAboveThree.and(printGradeAbove3_9).test(student)){
                System.out.println(student);
            }
        });
    }

    private static void printGpaGreaterThan3_9() {
        System.out.println("printGpaGreaterThan3_9");
        studentList.forEach(student -> {
            if(printGradeAbove3_9.test(student)){
                System.out.println(student);
            }
        });
    }

    private static void printGradeGreaterThan3() {
        System.out.println("printGradeGreaterThan3");
        studentList.forEach(student -> {
            if(printGradeAboveThree.test(student)){
                System.out.println(student);
            }
        });
    }
}
