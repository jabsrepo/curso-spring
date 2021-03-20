package com.srtart.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srtart.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
	
	

}
