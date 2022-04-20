package com.training;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.training.model.Account;
import com.training.model.Customer;
import com.training.repo.AccountRepo;
import com.training.repo.CustomerRepo;

@SpringBootApplication
public class SpringBootBankDemo {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBankDemo.class, args);
	}
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private AccountRepo accountRepo;
	
	//@PostConstruct
	public void init() {
		 Customer customer = new Customer();
		 customer.setName("sam");
		 
		 Account acc1 = new Account();
		 acc1.setBalance(2000.0);
		 acc1.setAccountType("SB");
		 acc1.setCustomer(customer);
		 
		 Account acc2 = new Account();
		 acc2.setBalance(3000.0);
		 acc2.setAccountType("Current");
		 acc2.setCustomer(customer);
		 
		 List<Account> list = new ArrayList<>();
		 list.add(acc1); list.add(acc2);
		 customer.setAccounts(list);
		 
		 customerRepo.save(customer);
	}
	
//	@Bean
//	public CommandLineRunner getRunner1(ApplicationContext ctx) {
//		return args->{
//			Customer customer = customerRepo.findById(7l).get();
//			List<Account> list1 = customer.getAccounts();
//			
//			System.out.println("Customer Details: "+customer);
//			System.out.println("Account Details: "+ list1);
//		};
//	}
	
}
