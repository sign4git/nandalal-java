package functionalinterface.consumer;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterfacePart2 {
   static List<Student> studentList = StudentDataBase.getAllStudents();
   static Consumer<Student> c1 = s -> System.out.println(s.getName());
   static Consumer<Student> c2 = s -> System.out.println(s.getActivities());
    public static void main(String[] args) {
        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingConditions();
    }

    private static void printName() {
        System.out.println("printName() ::: ");
        studentList.forEach(c1);
    }

    private static void printNameAndActivities() {
        System.out.println("printNameAndActivities() ::: ");
        studentList.forEach(c1.andThen(c2));
    }

    private static void printNameAndActivitiesUsingConditions() {
        System.out.println("printNameAndActivitiesUsingConditions() ::: ");
        studentList.forEach(student -> {
            if(student.getGradeLevel()>3){
                c1.andThen(c2).accept(student);
            }
        });
    }
}
