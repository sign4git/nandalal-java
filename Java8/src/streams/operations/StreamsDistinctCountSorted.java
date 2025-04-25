package streams.operations;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDistinctCountSorted {

    public static List<String> printListOfUniqueActivitiesInAlphabeticalOrder(){
        List<String> uniqueActivitiesInOrder = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return uniqueActivitiesInOrder;
    }

    public static Long uniqueActivitiesCount(){
        Long uniqueActivitiesCount = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        return uniqueActivitiesCount;
    }

    public static void main(String[] args) {
        System.out.println(uniqueActivitiesCount());
        System.out.println(printListOfUniqueActivitiesInAlphabeticalOrder());
    }
}
