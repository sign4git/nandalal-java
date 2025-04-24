package functionalinterface.function;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;
import functionalinterface.predicate.PredicateStudentExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
    static Function<List<Student>, Map<String,Double>> function = students -> {
        Map<String,Double> resultMap = new HashMap<>();
        students.forEach(student -> {
            if(PredicateStudentExample.printGradeAboveThree.test(student))
                resultMap.put(student.getName(), student.getGpa());
        });
        return resultMap;
    };
    public static void main(String[] args) {
        System.out.println(function.apply(StudentDataBase.getAllStudents()));
    }
}
