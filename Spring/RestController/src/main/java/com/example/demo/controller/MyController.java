package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;

@RestController
@RequestMapping(value="/web")
public class MyController {
	@Autowired
	BookRepo repo;
	
	
	@GetMapping("/books")
	public List<Book> findAll(){
		return repo.findAll();
	}

	@PostMapping("/books")
	public Book createBook(@RequestBody Book book){
		return repo.save(book);
	}
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book){
		return repo.save(book);
	}
	@DeleteMapping("/books/{id}")
	public List<Book> deleteBook(@PathVariable Integer id){
		repo.deleteById(id);
		return repo.findAll();
	}
	//@RequestMapping(value="/hi")
//	public String sayHello() {
//		return "hello world";
//	}
//	
	
}
