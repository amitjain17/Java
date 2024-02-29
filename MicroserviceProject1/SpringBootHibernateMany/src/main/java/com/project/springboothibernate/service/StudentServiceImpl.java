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
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private AddressRepo addressRepo;

	@Override
	public void saveStudent() {
		
		Student student = new Student("1","Amit");
		
		Address address = new Address("101","ManyToOne",student);
		
		addressRepo.save(address);
	}

	@Override
	public List<Student> showAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
