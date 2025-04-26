package streams.operations;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.*;

public class StreamsReduceExample {

    public static Integer reduceWithIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce(1,(a,b)->a*b);
    }

    public static Optional<Integer> reduceWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b)->a*b);
    }

    public static Optional<Student> getHighestGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((student1, student2) ->
                    student1.getGpa()> student2.getGpa()?student1:student2
                );
    }

    public static Optional<Student> getHighestGpaStudentUsingComparator(){
        Comparator<Double> comparator = Double::compareTo;
        return StudentDataBase.getAllStudents().stream()
                .reduce((student1, student2) ->
                        (comparator.compare(student1.getGpa(), student2.getGpa())>0?student1:student2)
                );
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4);
        System.out.println(reduceWithIdentity(integerList));
        System.out.println(reduceWithoutIdentity(integerList).get());
        System.out.println(reduceWithoutIdentity(new ArrayList<>()).isPresent());
        if(getHighestGpaStudent().isPresent()){
            System.out.println(getHighestGpaStudent().get());
        }
        if(getHighestGpaStudentUsingComparator().isPresent()){
            System.out.println(getHighestGpaStudentUsingComparator().get());
        }
    }
}
