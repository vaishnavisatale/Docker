package com.vs.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vs.demo.entity.Book;
import com.vs.demo.repo.BookRepo;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class SpringBootDockerMongoDbExampleApplication {

	
	@Autowired
	BookRepo b;
	
	
	@GetMapping
	public List<Book> get()
	{
		return b.findAll();
	}
	
	@PostMapping
	public Book put(@RequestBody Book b1)
	{
		return b.save(b1);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerMongoDbExampleApplication.class, args);
	}

}
