package com.grzegorzcieslik.sprtingtut;

import com.grzegorzcieslik.sprtingtut.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SprtingtutApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprtingtutApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(
						1l, "Mariam", "mariam.jamal@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21
				)
		);
	}

}
