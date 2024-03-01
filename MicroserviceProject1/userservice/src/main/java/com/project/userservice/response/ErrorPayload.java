package com.project.userservice.response;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ErrorPayload {

	private String message;
	
	private boolean status;
	
	private HttpStatus httpStatus;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public ErrorPayload(String message, boolean status, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.status = status;
		this.httpStatus = httpStatus;
	}

	public ErrorPayload() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ErrorPayload [message=" + message + ", status=" + status + ", httpStatus=" + httpStatus + "]";
	} 
	
	
	
}
