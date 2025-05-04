package optional;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    private static String getStudentName(){
        Student student = StudentDataBase.studentSupplier.get();
        if(null!=student)
            return student.getName();
        return null;//null belongs to any type. not specific to string
    }

    private static Optional<String> getStudentNameOptional(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent())
            return studentOptional.map(Student::getName);
        return Optional.empty();//always returns optional type
    }

    public static void main(String[] args) {
        String studentName = getStudentName();
        if(null!=studentName)
            System.out.println("Length of student : " + studentName.length());
        else
            System.out.println("Student not found");

        Optional<String> optionalString = getStudentNameOptional();
        if(optionalString.isPresent())
            System.out.println("Length of student using optional : " + optionalString.get().length());
        else
            System.out.println("Student not found");
    }
}
