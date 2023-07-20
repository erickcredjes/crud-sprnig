package com.jemak.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jemak.crudspring.model.Course;
import com.jemak.crudspring.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(CourseRepository cr) {
		return args -> {
			cr.deleteAll();

			Course c = new Course();
			c.setName("SqlServer Fundamentos");
			c.setCategory("data-base");

			cr.save(c);
		};
	}

}
