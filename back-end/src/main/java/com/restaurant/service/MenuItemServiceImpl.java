package com.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.restaurant.model.MenuItem;
import com.restaurant.model.User;
import com.restaurant.repository.MenuItemRepository;

public class MenuItemServiceImpl {
	
	@Autowired
	private  MenuItemRepository menuItemRepository;
	
	
	public MenuItem createMenuItem(User user, MenuItem menuItem) {
		menuItem.setCreator(user);
		return menuItemRepository.save(menuItem);
	}

}
