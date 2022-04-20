package com.training.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
//@EnableWebSecurity
public class SecurityConfigurationInMemory extends WebSecurityConfigurerAdapter {

	
	
	//Authentication
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
		.withUser("user1")
		.password("{noop}use")
		.roles("USER")
		.and()
		.withUser("a")
		.password("{noop}a")
		.roles("ADMIN");
	}
	
	//Authorization
	
	public void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/u")
		//.hasRole("USER")
		.hasAnyRole("USER","ADMIN")
		//.antMatchers("/a","/u")
		.antMatchers("/a")
		.hasRole("ADMIN")
		.and()
		.formLogin();
		
	}
	
	
}
