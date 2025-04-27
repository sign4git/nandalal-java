package streams.operations;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.Optional;

public class StreamFindExample {

    public static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student-> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student-> student.getGpa()>=4.1)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> findAny = findAny();
        if(findAny.isPresent()){
            System.out.println("student found : "+findAny().get());
        }else{
            System.out.println("student not found");
        }

        Optional<Student> findFirst = findFirst();
        if(findFirst.isPresent()){
            System.out.println("student found : "+findFirst().get());
        }else{
            System.out.println("student not found");
        }
    }
}
