package optional;

import functionalinterface.datamodel.Laptop;
import functionalinterface.datamodel.Student;
import functionalinterface.datamodel.StudentDataBase;

import java.util.Optional;

public class OptionalFilterMapFlatMap {

    public static void optionalFilter(){
        Optional<Student> optionalStudent = Optional.ofNullable
                (StudentDataBase.studentSupplier.get());
        optionalStudent.filter(s->s.getGpa()>=3.5)
                .ifPresent(System.out::println);
    }

    public static void optionalMap(){
        Optional<Student> optionalStudent = Optional.ofNullable
                (StudentDataBase.studentSupplier.get());
        optionalStudent.filter(s->s.getGpa()>=3.5)
                .map(Student::getName).ifPresent(s-> System.out.println(s));
    }

    public static void optionalFlatMap(){
        Optional<Student> optionalStudent = Optional.ofNullable
                (StudentDataBase.studentSupplierWithLaptop.get());
        Optional<String> optionalString = optionalStudent.filter(s->s.getGpa()>=3.5)
                .flatMap(Student::getLaptop).map(Laptop::getName);
        optionalString.ifPresent(s-> System.out.println("Laptop Name : "+s ));
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
