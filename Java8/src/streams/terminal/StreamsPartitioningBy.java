package streams.terminal;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPartitioningBy {

    public static void partitioningByExample(){
        Predicate<Student> studentsAbove3_8 = student -> student.getGpa()>=3.8;
        Map<Boolean, List<Student>> studentsMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(studentsAbove3_8));
        System.out.println(studentsMap);
    }

    public static void partitioningByExample_1(){
        Predicate<Student> studentsAbove3_8 = student -> student.getGpa()>=3.8;
        Map<Boolean, Set<Student>> studentsMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(studentsAbove3_8,Collectors.toSet()));
        System.out.println(studentsMap);
    }

    public static void main(String[] args) {
        partitioningByExample();
        partitioningByExample_1();
    }
}
