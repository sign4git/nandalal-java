package streams.operations;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;

public class StreamMatchExample {

    public static List<Student> studentList = StudentDataBase.getAllStudents();

    public static boolean anyMatch(){
        return studentList.stream().
                anyMatch(student -> student.getGpa()>=4.0);
    }

    public static boolean allMatch(){
        return studentList.stream().
                allMatch(student -> student.getGpa()>=3.5);
    }

    public static boolean noneMatch(){
        return studentList.stream().
                noneMatch(student -> student.getGpa()>=4.1);
    }

    public static void main(String[] args) {
        System.out.println("any match : " +anyMatch());
        System.out.println("all match : " +allMatch());
        System.out.println("none match : " +noneMatch());

    }
}
