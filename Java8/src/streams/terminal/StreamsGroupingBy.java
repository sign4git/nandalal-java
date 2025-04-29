package streams.terminal;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupingBy {

    public static void groupStudentsByGender(){
        Map<String, List<Student>> studentsMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(studentsMap);
    }

    public static Map<String, List<Student>> customGroupingByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(s->s.getGpa()>=3.8?"FIRST CLASS":"SECOND CLASS"));

    }

    public static void main(String[] args) {
        groupStudentsByGender();
        System.out.println(customGroupingByGpa());
    }
}
