package streams.operations;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSortUsingComparator {

    public static List<Student> sortStudentByName(){
        System.out.println("Sort student by name");
        List<Student> studentList = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
        return studentList;
    }

    public static List<Student> sortStudentByGpa(){
        System.out.println("Sort Student by GPA");
        List<Student> studentList = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
        return studentList;
    }

    public static void main(String[] args) {
        System.out.println(sortStudentByName());
        System.out.println(sortStudentByGpa());
    }
}
