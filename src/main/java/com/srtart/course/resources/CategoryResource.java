package com.srtart.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srtart.course.entities.Category;
import com.srtart.course.services.CategoryService;

@RestController
@RequestMapping(value = "/categoryies")

public class CategoryResource {

	@Autowired
	private CategoryService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> get(@PathVariable Long id){
		Category cat = service.findById(id);
		
		return ResponseEntity.ok().body(cat);
		
	}
	
	@GetMapping
	public  ResponseEntity<List<Category>> listAll(){ 
		
		List<Category> lst = service.findAll();
		
		return ResponseEntity.ok().body(lst);
	}
	
		
}
