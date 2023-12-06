package com.spring.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.project.studentInfo.Studentinfo;
import com.spring.project.studentService.StudentinfoService;

@SpringBootApplication
public class StudentinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentinfoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner test (StudentinfoService studentinfoService) {
		
		Studentinfo student = new Studentinfo();
		
		student.setStudentName("madhu");
		student.setStudentMarks(100);
		student.setStudentDob("09/10/1994");
		
		studentinfoService.add(student);
		
		return null;
	}

}
