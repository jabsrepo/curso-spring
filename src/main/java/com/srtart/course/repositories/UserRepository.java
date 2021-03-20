package com.srtart.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srtart.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
			