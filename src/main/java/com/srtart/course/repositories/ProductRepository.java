package com.srtart.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srtart.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
