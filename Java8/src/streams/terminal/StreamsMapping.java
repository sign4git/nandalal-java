package streams.terminal;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsMapping {

    public static List<String> namesList(){
        Function<Student,String> getStudentName = Student::getName;
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(getStudentName,Collectors.toList()));
    }

    public static Set<String> namesSet(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toSet()));
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
