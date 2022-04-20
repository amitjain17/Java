package com.training;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.training.model.Book;
import com.training.repo.BookRepo;

@SpringBootApplication
public class SpringBootBookProducerDay3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookProducerDay3Application.class, args);
	}
	
	@Autowired
	private BookRepo bookrepo;
	
	@PostConstruct
	public void saveBooks() {
		bookrepo.save(new Book(123,"A",1230.3,213,LocalDate.now()));
		bookrepo.save(new Book(12,"AB",123.3,21,LocalDate.now()));

	}
	//Command Line Ruuner
	
	@Bean
	public CommandLineRunner getRunner(ApplicationContext ctx) {
		return args->{
			System.out.println(bookrepo.findByTitleLike("%A%"));
			System.out.println(bookrepo.findByStockGreaterThan(100));

		};
	}
	
	
}
