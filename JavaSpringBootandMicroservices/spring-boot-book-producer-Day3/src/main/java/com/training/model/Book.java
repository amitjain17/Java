package com.training.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data				//For Both Getters and Setters using dependency LOMBOK
@Entity				//table Name by default Book
public class Book {
	
	@Id
	private Integer isbn;
	@Column(name="book_title",length = 100,nullable = false,unique = true)
	private String title;
	private Double price;
	private Integer stock;
	
	private LocalDate dop;
	
//	@Temporal(value=TemporalType.DATE) 		//Old way to store Date
//	private Date dop;
}
