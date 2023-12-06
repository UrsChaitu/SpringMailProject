package com.spring.project.studentInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentinfo")
public class Studentinfo {
	
	@Id
	private String studentName;
	private String studentDob;
	private int studentMarks;
	
	public Studentinfo () {
		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentDob() {
		return studentDob;
	}

	public void setStudentDob(String studentDob) {
		this.studentDob = studentDob;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	public Studentinfo(String studentName, String studentDob, int studentMarks) {
		super();
		this.studentName = studentName;
		this.studentDob = studentDob;
		this.studentMarks = studentMarks;
	}

	
}
