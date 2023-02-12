package com.ali.gradesubmission;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ali.gradesubmission.entity.Student;
import com.ali.gradesubmission.repository.StudentRepository;

@SpringBootApplication
public class GradeSubmissionApplication implements CommandLineRunner {

	@Autowired StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(GradeSubmissionApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Student[] students = new Student[] {
				new Student("Sami", LocalDate.parse(("1902-07-31"))),
				new Student( "Avan", LocalDate.parse(("1990-03-01"))),
				new Student("Ranco", LocalDate.parse(("1949-08-19"))),
				new Student( "Nadima", LocalDate.parse(("1970-07-29")))
		};
		for (int i = 0; i < students.length; i++) {
			studentRepository.save(students[i]);
		}
	}

}
