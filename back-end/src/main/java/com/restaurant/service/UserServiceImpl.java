package com.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.restaurant.model.MenuItem;
import com.restaurant.model.User;
import com.restaurant.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired	
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		
	}

	@Override
	public User getUserByUserName(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}
	
	
	
	
	
	

}
