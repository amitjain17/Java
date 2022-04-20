package com.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Book;
import com.training.service.BookServiceI;

@RequestMapping("/bookstore/api")
@RestController
public class BookControllers {
	
	@Autowired
	private BookServiceI bookServiceI;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "HELLO in";
	}
	
	@GetMapping("/book/isbn/{isbn}")
	public ResponseEntity<Book> getBook(@PathVariable("isbn") Integer isbn) {
		
		return bookServiceI.getBook(isbn);
	}
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookServiceI.getBooks();
	}
	
	@DeleteMapping("/book/isbn/{isbn}")
	public Book deleteBook(@PathVariable("isbn") Integer isbn) {
		return bookServiceI.deleteBook(isbn);
	}
	
	@PutMapping("/book/isbn/{isbn}/stock/{newstock}")
	public Book updateBook(@PathVariable("isbn") Integer isbn,@PathVariable("newstock") Integer newStock) {
		return bookServiceI.updateBookStock(isbn,newStock);
	}
	
	@ResponseStatus(code=HttpStatus.CREATED)
	@PostMapping("/book")
	public Book deleteBook(@RequestBody Book book) {
		return bookServiceI.addBook(book);
	}
	
}
