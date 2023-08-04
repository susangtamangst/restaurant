package com.restaurant.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/menu-items")
public class MenuItemController {
	
	private  MenuItemService menuItemService;
	
	public MenuItemController(MenuItemService menuItemService) {
		this.menuItemService= menuItemService;
	}

}
