package com.training.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.training.services.MyUserDetailsService;

//@Configuration
//@EnableWebSecurity
public class SecurityCongurationDB {
	
	
	@Bean
	public PasswordEncoder MypasswordEncoder() {
		
		return new PasswordEncoder() {
			@Override
			public String encode(CharSequence rawPassword) {
				return rawPassword.toString();
			}
			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				return rawPassword.equals(encodedPassword);
			}
			
			
		};
	}
	
	@Autowired
	private MyUserDetailsService userDetailsService;
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.userDetailsService(userDetailsService)
		.passwordEncoder(MypasswordEncoder());
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
