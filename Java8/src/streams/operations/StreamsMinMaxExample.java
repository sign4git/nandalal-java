package streams.operations;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.Optional;

public class StreamsMinMaxExample {

    public static Optional<Student> maxValueOfNotebooks(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)-> s1.getNoteBooks()> s2.getNoteBooks()?s1:s2);

    }

    public static Optional<Student> minValueOfNotebooks(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)-> s1.getNoteBooks()> s2.getNoteBooks()?s2:s1);

    }

    public static void main(String[] args) {
        Optional<Student> maxNotebooksByStudent = maxValueOfNotebooks();
        if(maxNotebooksByStudent.isPresent()){
            System.out.println("Max notebook held by a student is "+maxNotebooksByStudent.get().getNoteBooks());
        }else{
            System.out.println("Empty");
        }

        Optional<Student> minNotebooksByStudent = minValueOfNotebooks();
        if(minNotebooksByStudent.isPresent()){
            System.out.println("Max notebook held by a student is "+minNotebooksByStudent.get().getNoteBooks());
        }else{
            System.out.println("Empty");
        }
    }
}
