package com.project.springboothibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springboothibernate.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, String>{

}
