package com.project.springbootjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.project.springbootjdbc.repo.JdbcCallRepo;

@SpringBootApplication
public class SpringBootJdbcApplication {

	
	public static void main(String[] args) {
		ApplicationContext ct = SpringApplication.run(SpringBootJdbcApplication.class, args);
		
		JdbcCallRepo jdbc = ct.getBean(JdbcCallRepo.class);
		jdbc.callJDBC();
		
	}

}
