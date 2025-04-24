package streams;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();
    static Predicate<Student> studentsWithGradeAboveThree = (s)->s.getGradeLevel()>3;
    static Predicate<Student> studentsWithGpaAbove3_5 = (s)->s.getGpa()>3.5;
    public static void main(String[] args) {
        //get map of student name with list of activities using stream
        //use peek to debug streams
        Map<String,List<String>> studentActivitiesMap = studentList.stream()
                .peek(student -> System.out.println("student detail " + student))
                .filter(studentsWithGradeAboveThree)
                .peek(student -> System.out.println("after 1st filter " + student))
                .filter(studentsWithGpaAbove3_5)
                .peek(student -> System.out.println("after 2nd filter " + student))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentActivitiesMap);
    }
}
