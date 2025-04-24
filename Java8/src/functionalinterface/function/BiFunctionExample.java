package functionalinterface.function;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;
import functionalinterface.predicate.PredicateStudentExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction =
            (students,studentPredicate) -> {
                Map<String, Double> resultList = new HashMap<>();
                students.forEach(student -> {
                    if(studentPredicate.test(student)){
                        resultList.put(student.getName(), student.getGpa());
                    }
                });
                return resultList;
            };
    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),
                PredicateStudentExample.printGradeAbove3_9));
    }
}
