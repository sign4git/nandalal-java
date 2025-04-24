package functionalinterface.predicate;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {
    Predicate<Student> p1 = a -> a.getGradeLevel()>=3;
    Predicate<Student> p2 = a -> a.getGpa()>=3.9;
    BiConsumer<String, List<String>> biConsumer = (a,b)->
            System.out.println("Name: "+a+" Activities: "+b);
    List<Student> studentList = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        new PredicateAndConsumer().printNameAndActivities();
    }

    private void printNameAndActivities() {
        studentList.forEach(student -> {
            if(p1.and(p2).test(student)){
                biConsumer.accept(student.getName(), student.getActivities());
            }
        });
    }
}
