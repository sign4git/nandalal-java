package com.example.SpringDataJpa;

import com.example.SpringDataJpa.model.Student;
import com.example.SpringDataJpa.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDataJpaApplication.class, args);
		Student s1= new Student();
		s1.setRollNo(1);
		s1.setName("Virender Sehwag");
		s1.setMarks(319);

		Student s2= new Student();
		s2.setRollNo(2);
		s2.setName("Sachin Tendulkar");
		s2.setMarks(248);

		StudentRepository studentRepo = context.getBean(StudentRepository.class);
		studentRepo.save(s1);
		studentRepo.save(s2);
		System.out.println("results::"+studentRepo.findAll());
		System.out.println("finding by Id::"+studentRepo.findById(1).orElse(new Student()));
		System.out.println("finding by Name::"+studentRepo.findByName("Sachin Tendulkar"));
		System.out.println("find by marks greater than::"+studentRepo.findByMarksGreaterThan(200));
		s2.setMarks(200);
		s1.setMarks(219);
		studentRepo.save(s1);
		studentRepo.save(s2);
		studentRepo.delete(s1);


	}

}
