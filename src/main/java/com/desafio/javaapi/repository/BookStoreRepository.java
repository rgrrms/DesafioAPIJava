package com.desafio.javaapi.repository;

import com.desafio.javaapi.model.BookStoreModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookStoreRepository extends MongoRepository<BookStoreModel, String> {
}
