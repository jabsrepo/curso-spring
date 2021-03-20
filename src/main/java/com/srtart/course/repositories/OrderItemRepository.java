package com.srtart.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srtart.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
	