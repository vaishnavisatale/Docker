package com.vs.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vs.demo.entity.Book;

public interface BookRepo extends MongoRepository<Book, Integer>{

}
