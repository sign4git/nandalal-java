package streams.operations;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities(){
        List<String> studentActivitiesList = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        return studentActivitiesList;
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
    }
}
