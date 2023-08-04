package com.restaurant.service;

import com.restaurant.model.User;

public interface UserService {
	
	void registerUser(User user);
	
	User getUserByUserName(String username);
	

}
