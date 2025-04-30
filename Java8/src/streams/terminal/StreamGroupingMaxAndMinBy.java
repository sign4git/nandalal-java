package streams.terminal;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamGroupingMaxAndMinBy {

    public static void main(String[] args) {
        getMaxGpaStudentByGrade();
        getMinGpaStudentByGrade();
    }

    private static void getMaxGpaStudentByGrade() {
        Map<Integer, Student> toppersByGrade= StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)
                        ));
        System.out.println(toppersByGrade);
    }

    private static void getMinGpaStudentByGrade() {
        Map<Integer, Optional<Student>> leastGpaByGrade= StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(leastGpaByGrade);
    }
}
