package com.training.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	private String message;

//	public HelloWorld(String message) {
//		this.message = message;
//	}

	public String sayhello() {
		return "IN HELLO WORLD"+message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
