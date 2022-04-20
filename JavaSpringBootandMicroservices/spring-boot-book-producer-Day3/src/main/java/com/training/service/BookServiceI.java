package com.training.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.training.model.Book;

public interface BookServiceI {
	
	public Book addBook(Book book);
	public List<Book> getBooks();
	
	public ResponseEntity<Book> getBook(Integer isbn);
	
	public Book deleteBook(Integer isbn);
	
	public Book updateBookStock(Integer isbn, Integer newStock);
}
