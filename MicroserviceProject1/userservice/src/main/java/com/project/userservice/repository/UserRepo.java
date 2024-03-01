package com.project.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.userservice.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{

}
