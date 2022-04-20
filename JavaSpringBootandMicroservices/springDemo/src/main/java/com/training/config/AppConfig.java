package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.training.bean.AddOperator;
import com.training.bean.MultiplyOperator;
import com.training.interfaces.Operator;

@Configuration
@ComponentScan({"com.training"})
public class AppConfig {
	
		//	@Bean(name="op")
		//	public Operator getOperator()
		//	{
		//		return new MultiplyOperator();
		//	}

}
