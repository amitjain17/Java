package com.training.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.training.model.Customer;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, Long> {

	public List<Customer> findByName(String name);
	
	@Query("{name:?0}")
	public List<Customer> getCustomersByName(String name);
	
	@Query("{age :{$gt : ?0}}")
	public List<Customer> getCustomersByAge(int age);
	
}
