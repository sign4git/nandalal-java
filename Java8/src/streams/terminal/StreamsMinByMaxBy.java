package streams.terminal;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxBy {

    public static Optional<Student> minGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println(minGpaStudent().isPresent()?minGpaStudent().get():"student not found");
        System.out.println(maxGpaStudent().isPresent()?maxGpaStudent().get():"student not found");
    }
}
