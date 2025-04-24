package method.referencing;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReferencing {
    static List<Student> studentList = StudentDataBase.getAllStudents();
    static Consumer<Student> c1 = Student ::printActivities;
    public static void main(String[] args) {
        studentList.forEach(c1);
    }
}
