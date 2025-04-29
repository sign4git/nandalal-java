package streams.terminal;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsJoining {

    public static List<Student> studentList = StudentDataBase.getAllStudents();

    public static String joining() {
        return studentList.stream()
                .map(Student::getName)
                .collect(Collectors.joining("-", "[", "]"));
    }

    public static void main(String[] args) {
        System.out.println(studentList.stream()
                .map(Student::getName)
                .collect(Collectors.joining()));

        System.out.println(studentList.stream()
                .map(Student::getName)
                .collect(Collectors.joining("-")));

        System.out.println(studentList.stream()
                .map(Student::getName)
                .collect(Collectors.joining("-", "[", "]")));

        System.out.println("Join with format called from method " + joining());
    }
}
