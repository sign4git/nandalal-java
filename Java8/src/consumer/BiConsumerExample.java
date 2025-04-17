package consumer;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    static BiConsumer<String, List<String>> biConsumer = (a,b) ->
            System.out.println("Name : "+a+" Activities : "+b);
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        printNameAndActivitiesUsingBiConsumer();
    }

    private static void printNameAndActivitiesUsingBiConsumer() {
        studentList.forEach(student -> biConsumer.accept(student.getName(),
                student.getActivities()));
    }
}
