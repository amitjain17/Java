package com.project.userservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.project.userservice.response.ErrorPayload;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorPayload> resourceNotFoundExceptionHandler(Exception ex){
			ErrorPayload eP = new ErrorPayload();
			eP.setMessage(ex.getMessage());
			eP.setHttpStatus(HttpStatus.NOT_FOUND);
			eP.setStatus(false);
			return new ResponseEntity<ErrorPayload>(eP, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorPayload> exceptionHandler(Exception ex){
			ErrorPayload eP = new ErrorPayload();
			eP.setMessage(ex.getMessage());
			eP.setHttpStatus(HttpStatus.NOT_FOUND);
			eP.setStatus(false);
			return new ResponseEntity<ErrorPayload>(eP, HttpStatus.NOT_FOUND);
	}

}
