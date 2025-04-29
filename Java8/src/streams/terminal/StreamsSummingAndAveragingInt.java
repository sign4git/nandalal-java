package streams.terminal;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSummingAndAveragingInt {

    public static int summation(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double averaging(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("sum "+summation());
        System.out.println("avg "+averaging());
    }
}
