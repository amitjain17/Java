package com.project.springboothibernate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.springboothibernate.entity.Student;


public interface StudentService {
	
	void saveStudent();
	List<Student> showAllStudent();
	

}
