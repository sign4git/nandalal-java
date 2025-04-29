package streams.terminal;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsCounting {

    public static List<Student> studentList = StudentDataBase.getAllStudents();

    public static long count(){
        return studentList.stream().filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.counting());
//        return studentList.stream().filter(student -> student.getGpa()>=3.9)
//                .count();


    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
