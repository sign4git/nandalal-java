package streams.terminal;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupingByTwoParams {

    public static void groupingByExample1() {
        Map<Integer,Integer> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.summingInt(Student::getNoteBooks)));
        System.out.println(studentMap);
    }

    public static void groupingByExample2() {
        Map<Integer,Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student->student.getGpa()>=3.8?"OUTSTANDING":"AVERAGE")));
        System.out.println(studentMap);
    }

    public static void main(String[] args) {
        groupingByExample1();
        groupingByExample2();
    }
}
