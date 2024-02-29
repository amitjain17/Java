package com.project.springboothibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.project.springboothibernate.entity.Address;
import com.project.springboothibernate.entity.Student;
import com.project.springboothibernate.service.StudentServiceImpl;

@SpringBootApplication
public class SpringBootHibernateApplication {
	
	
	public static void main(String[] args) {
		ApplicationContext ct =	SpringApplication.run(SpringBootHibernateApplication.class, args);
	
		StudentServiceImpl studentService = ct.getBean(StudentServiceImpl.class);
		
		
		studentService.saveStudent();
	}

}
