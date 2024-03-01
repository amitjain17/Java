package com.project.userservice.service;

import java.util.List;

import com.project.userservice.entities.User;

public interface UserService {
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String id);
	
	String deleteUser(String id);
	
	User updateUser(User user);
	

}
