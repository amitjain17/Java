package com.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.training.model.Book;
import com.training.repo.BookRepo;

@Service
public class BookService implements BookServiceI {

	@Autowired
	private BookRepo bookRepo;
	
	@Override
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getBooks() {
		
		return bookRepo.findAll();
	}

	@Override
	public ResponseEntity<Book> getBook(Integer isbn) {
		Optional<Book> bookOp= bookRepo.findById(isbn);
		Book bookFound = null;
		if(bookOp.isPresent()) {
			bookFound= bookOp.get();
			
			return new ResponseEntity<Book>(bookFound, HttpStatus.OK);
		}
		return null;
	}

	@Override
	public Book deleteBook(Integer isbn) {
		Optional<Book> bookOp= bookRepo.findById(isbn);
		Book bookFound = null;
		if(bookOp.isPresent()) {
			bookFound= bookOp.get();
			bookRepo.delete(bookFound);
			return bookFound;
		}
		return null;
	}

	@Override
	public Book updateBookStock(Integer isbn, Integer newStock) {
		Optional<Book> bookOp= bookRepo.findById(isbn);
		Book bookFound = null;
		if(bookOp.isPresent()) {
			bookFound= bookOp.get();
			bookFound.setStock(bookFound.getStock()+newStock);
			
			bookRepo.save(bookFound);
			return bookFound;
		}
		return null;
	}
	
	
	
	
}
