package streams.operations;

import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

public class StreamsMapFilterReduce {

    public static Integer noOfNotebooksByMaleStudentsAboveGrade2(){
        return StudentDataBase.getAllStudents().stream()
                .filter(s->s.getGender().equalsIgnoreCase("male"))
                .filter(s->s.getGradeLevel()>2)
                .map(Student::getNoteBooks)
                .reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("No of notebooks held my male students above grade 2 is "+
                noOfNotebooksByMaleStudentsAboveGrade2());
    }
}
