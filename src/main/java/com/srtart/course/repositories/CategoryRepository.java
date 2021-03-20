package com.srtart.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srtart.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
