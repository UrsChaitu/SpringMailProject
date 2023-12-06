package com.spring.project.studentInfoRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.studentInfo.Studentinfo;

public interface StudentinfoRepository extends JpaRepository<Studentinfo, String>{

}
