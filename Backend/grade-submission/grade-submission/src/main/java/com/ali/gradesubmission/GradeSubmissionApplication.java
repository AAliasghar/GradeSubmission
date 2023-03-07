package com.ali.gradesubmission;

// import java.time.LocalDate;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.ali.gradesubmission.entity.Course;
// import com.ali.gradesubmission.entity.Student;
// import com.ali.gradesubmission.repository.CourseRepository;
// import com.ali.gradesubmission.repository.GradeRepository;
// import com.ali.gradesubmission.repository.StudentRepository;

@SpringBootApplication

public class GradeSubmissionApplication  {

	public static void main(String[] args) {
		SpringApplication.run(GradeSubmissionApplication.class, args);

	}
}
// public class GradeSubmissionApplication implements CommandLineRunner {

	
// 	@Autowired 
// 	StudentRepository studentRepository;

// 	@Autowired 
// 	CourseRepository courseRepository;

// 	@Autowired
// 	 GradeRepository gradeRepository;
// 	public static void main(String[] args) {
// 		SpringApplication.run(GradeSubmissionApplication.class, args);

// 	}

// 	@Override
// 	public void run(String... args) throws Exception {
// 		Student[] students = new Student[] {
// 				new Student("Sami", LocalDate.parse(("1902-07-31"))),
// 				new Student( "Avan", LocalDate.parse(("1990-03-01"))),
// 				new Student("Ranco", LocalDate.parse(("1949-08-19"))),
// 				new Student( "Nadima", LocalDate.parse(("1970-07-29")))
// 		};
// 		for (int i = 0; i < students.length; i++) {
// 			studentRepository.save(students[i]);
// 		}
		
// 		Course[] courses = new Course[] {
// 				new Course("Charms", "CH104",
// 						"In this class, you will learn spells concerned with giving an object new and unexpected properties."),
// 				new Course("Defence Against the Dark Arts", "DADA",
// 						"In this class, you will learn defensive techniques against the dark arts."),
// 				new Course("Herbology", "HB311",
// 						"In this class, you will learn the study of magical plants and how to take care of, utilise and combat them."),
// 				new Course("History of Magic", "HIS393",
// 						"In this class, you will learn about significant events in wizarding history."),
// 				new Course("Potions", "POT102",
// 						"In this class, you will learn correct mixing and stirring of ingredients to create mixtures with magical effects."),
// 				new Course("Transfiguration", "TR442",
// 						"In this class, you will learn the art of changing the form or appearance of an object.")
// 		};
// 		for (int i = 0; i < courses.length; i++) {
// 			courseRepository.save(courses[i]);
			
// 		}
// 	}

// }