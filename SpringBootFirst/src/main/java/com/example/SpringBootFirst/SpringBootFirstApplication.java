package com.example.SpringBootFirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootFirstApplication.class, args);

		//1. Creating objects using java
//		Alien obj = new Alien();
//		obj.code();

		//2. Creating objects using context
		Alien obj1 = context.getBean(Alien.class);
		obj1.code();
	}

}
