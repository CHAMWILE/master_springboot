package com.example.learnspring;

import com.example.learnspring.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@SpringBootApplication
@RestController

public class LearnspringApplication {

	public static void main (String[] args) {

		SpringApplication.run(LearnspringApplication.class, args);
	}
     @GetMapping("/")
		public List<Student> hello(){

			return List.of(
					new Student(
					1L,
					"Suleyman",
					"src@gmail.com",
					LocalDate.of(1999,Month.MARCH,5),
					25
					)
			);
		}
	}


