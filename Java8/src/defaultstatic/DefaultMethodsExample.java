package defaultstatic;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample {

    public static Consumer<Student> studentConsumer = s-> System.out.println(s.toString());

    public static void compareByName(List<Student> studentList){
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        System.out.println("compareByName Before sort : ");
        studentList.forEach(studentConsumer);
        studentList.sort(nameComparator);
        System.out.println("compareByName After sort : ");
        studentList.forEach(studentConsumer);
    }

    public static void compareByMarks(List<Student> studentList){
        Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
        System.out.println("compareByMarks Before sort : ");
        studentList.forEach(studentConsumer);
        studentList.sort(gpaComparator);
        System.out.println("compareByMarks After sort : ");
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList){
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
        System.out.println("comparatorChaining Before sort : ");
        studentList.forEach(studentConsumer);
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        System.out.println("comparatorChaining After sort : ");
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        compareByName(studentList);
        compareByMarks(studentList);
        comparatorChaining(studentList);
    }
}
