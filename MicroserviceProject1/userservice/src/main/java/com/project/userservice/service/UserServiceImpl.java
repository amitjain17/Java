package com.project.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.userservice.entities.User;
import com.project.userservice.exception.ResourceNotFoundException;
import com.project.userservice.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public User saveUser(User user) {
		
		User result = userRepo.save(user);
		return result;
	}

	@Override
	public List<User> getAllUser() {
		List<User> list = userRepo.findAll();
		return list;
	}

	@Override
	public User getUser(String id) {
		User result = userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException());
		return result;
	}

	@Override
	public String deleteUser(String id) {
		userRepo.deleteById(id);
		return "User "+ id +" delete successfully";
	}

	@Override
	public User updateUser(User user) {
		User result;
		String userId = user.getUserId();
		System.out.println(user);
		User res = userRepo.findById(userId).orElse(new User());
		if(res.getUserId()=="") {
			result  = userRepo.save(user);
		}else {
			userRepo.deleteById(userId);
			result  = userRepo.save(user);
		}
		return result;
	}

	
}
