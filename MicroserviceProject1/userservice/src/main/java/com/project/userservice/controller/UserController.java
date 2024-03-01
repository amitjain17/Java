package com.project.userservice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.userservice.entities.User;
import com.project.userservice.service.UserService;

import jakarta.websocket.server.PathParam;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/healthCheck")
	public String healthCheck() {
        Date d1 = new Date(); 
        String result  = "Application is working at time: " + d1 ;
		System.out.println(result);
		return result;
	}
	
	@PostMapping("saveuser")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User res = userService.saveUser(user);
		return new ResponseEntity<User>(res,HttpStatus.CREATED);
	}
	
	@GetMapping("getall")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> res = userService.getAllUser();
		return new ResponseEntity<List<User>>(res,HttpStatus.OK);
	}
	
	@GetMapping("getuser/{userId}")
	public ResponseEntity<User> getUser(@PathVariable(value = "userId") String id){
		User res = userService.getUser(id);
		return new ResponseEntity<User>(res,HttpStatus.OK);
	}
	
	@DeleteMapping("deleteuser/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable(name = "userId") String id){
		String res = userService.deleteUser(id);
		return new ResponseEntity<String>(res,HttpStatus.OK);
	}
	
	@PutMapping("/updateuser")
	public ResponseEntity<User> updateUser(@RequestBody User user){
		User res = userService.updateUser(user);
		return new ResponseEntity<User>(res,HttpStatus.CREATED);
	}

}
