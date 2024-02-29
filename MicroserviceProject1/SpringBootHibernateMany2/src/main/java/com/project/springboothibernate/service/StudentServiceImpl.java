package com.project.springboothibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springboothibernate.entity.Address;
import com.project.springboothibernate.entity.Student;
import com.project.springboothibernate.repository.AddressRepo;
import com.project.springboothibernate.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Autowired
	private AddressRepo addressRepo;

	@Override
	public void saveStudent() { 
		  
		  Address addr = new Address("1", "Bangloor");
	        //addressRepo.save(addr);
	 
	        Student emp1 = new Student("1", "Alpha", addr);
	        Student emp2 = new Student("2", "Beeta", addr);
	 
	        studentRepo.save(emp1);
	        studentRepo.save(emp2);
		 
	}

	@Override
	public List<Student> showAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
