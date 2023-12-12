package com.spring.project.studentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.studentInfo.Studentinfo;
import com.spring.project.studentInfoRepository.StudentinfoRepository;



@Service
public class StudentinfoService {

	@Autowired
	public StudentinfoRepository studentinfoRepository;
	
	public String add(Studentinfo studentinfo) {
		studentinfoRepository.save(studentinfo);
		
		return "query added...";
	}
	
}
