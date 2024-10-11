package com.example.SpringBootWithLayers;

import com.example.SpringBootWithLayers.model.Developer;
import com.example.SpringBootWithLayers.model.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootWithLayersApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootWithLayersApplication.class, args);
		System.out.println("Hello World");

		Developer dev = context.getBean(Developer.class);
		dev.compile();

		Laptop lap = context.getBean(Laptop.class);
		lap.addLaptop();
	}

}
