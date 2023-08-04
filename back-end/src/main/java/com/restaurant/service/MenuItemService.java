package com.restaurant.service;

import com.restaurant.model.MenuItem;
import com.restaurant.model.User;

public interface MenuItemService {
	
	MenuItem createMenuItem(User user, MenuItem menuItem);

}
