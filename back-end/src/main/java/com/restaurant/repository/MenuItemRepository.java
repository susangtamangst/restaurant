package com.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

}
