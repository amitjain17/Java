package com.training.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.AuthRequest;
import com.training.util.JwtUtil;

@RestController
public class SpringController {

//	@GetMapping
//	public String sayHello() {
//		return "Hello";
//	}
	
	@GetMapping("/u")
	public String sayHello2() {
		return "Hello2";
	}
	
	@GetMapping("/a")
	public String sayHello3() {
		return "Hello3";
	}
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	Logger log = LoggerFactory.getLogger(SpringController.class);
	
	@PostMapping("/authenticate")
	public String authenticate(@RequestBody AuthRequest authRequest) throws Exception {
		log.info("inside authenticate ");
		//try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUsername(),authRequest.getPassword()));	
//		}catch (Exception e) {
//				log.info("Exception :"+ e);
//				throw new Exception("Bad Credentials");
//		}
		return jwtUtil.generateToken(authRequest.getUsername());
		
	}
}
