package streams.terminal;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsGroupingByThreeArgs {

    public static void groupingByThreeArgs(){
        LinkedHashMap<String,Set<Double>> map=StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new,
                        Collectors.mapping(Student::getGpa,Collectors.toSet())));
        System.out.println(map);
    }

    public static void main(String[] args) {
        groupingByThreeArgs();
    }
}
