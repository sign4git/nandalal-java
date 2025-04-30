package parallel.stream;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamStudentActivities {

    public static void sequentialStreamPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> activitiesList = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println(activitiesList);
        System.out.println("Time taken in sequential : "+(endTime-startTime));
    }

    public static void parallelStreamPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> activitiesList = StudentDataBase.getAllStudents().parallelStream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println(activitiesList);
        System.out.println("Time taken in parallel : "+(endTime-startTime));
    }

    public static void main(String[] args) {
        sequentialStreamPrintStudentActivities();
        parallelStreamPrintStudentActivities();
    }
}
