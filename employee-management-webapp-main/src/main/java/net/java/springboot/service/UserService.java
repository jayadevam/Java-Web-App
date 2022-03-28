package net.java.springboot.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import net.java.springboot.dto.UserRegistrationDto;
import net.java.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
	
	UserDetails loadUserByUsername(String username);
}
