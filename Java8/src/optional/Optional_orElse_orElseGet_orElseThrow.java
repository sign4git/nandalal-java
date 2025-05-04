package optional;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.Optional;

public class Optional_orElse_orElseGet_orElseThrow {

    public static String orElse() {
//        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase
//                .studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        return optionalStudent.map(Student::getName).orElse("default");
    }

    public static String orElseGet() {
//        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase
//                .studentSupplier.get());
                Optional<Student> optionalStudent = Optional.ofNullable(null);
        return optionalStudent.map(Student::getName).orElseGet(() -> "default");
    }

    public static String orElseThrow() {
//        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase
//                .studentSupplier.get());
                Optional<Student> optionalStudent = Optional.ofNullable(null);
        return optionalStudent.map(Student::getName).orElseThrow(() -> new RuntimeException("Invalid Data/Data not found"));
    }

    public static void main(String[] args) {
        System.out.println("orElse : " + orElse());
        System.out.println("orElseGet : " + orElseGet());
        System.out.println("orElseThrow : " + orElseThrow());
    }
}
