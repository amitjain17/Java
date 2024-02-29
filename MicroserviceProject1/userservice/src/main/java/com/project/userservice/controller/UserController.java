package com.project.userservice.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/healthCheck")
	public String healthCheck() {
        Date d1 = new Date(); 
        String result  = "Application is working at time: " + d1 ;
		System.out.println(result);
		return result;
	}
}
