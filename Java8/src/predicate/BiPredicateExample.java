package predicate;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {
    Predicate<Student> p1 = a -> a.getGradeLevel()>=3;
    Predicate<Student> p2 = a -> a.getGpa()>=3.9;
    BiPredicate<Integer,Double> biPredicate = (grade, gpa)-> grade>=3 && gpa>=3.9;
    BiConsumer<String, List<String>> biConsumer = (a, b)->
            System.out.println("Name: "+a+" Activities: "+b);
    List<Student> studentList = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        new BiPredicateExample().printNameAndActivities();
    }

    private void printNameAndActivities() {
        studentList.forEach(student -> {
            if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
                biConsumer.accept(student.getName(), student.getActivities());
            }
        });
    }
}
