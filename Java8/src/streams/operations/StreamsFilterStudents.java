package streams.operations;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterStudents {

    public static List<Student> filterMaleStudentsWithGpaAbove3_5(){
        List<Student> studentList = StudentDataBase.getAllStudents().stream()
                .filter((student)-> student.getGender().equals("male"))
                .filter((student -> student.getGpa()>=3.9))
                .collect(Collectors.toList());
        return studentList;
    }

    public static void main(String[] args) {
        filterMaleStudentsWithGpaAbove3_5().forEach(System.out::println);
    }
}
