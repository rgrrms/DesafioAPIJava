package com.desafio.javaapi.service;

import com.desafio.javaapi.model.BookStoreModel;

import java.util.List;

public interface BookStoreService {

    List<BookStoreModel> getAllBooks();

    BookStoreModel addBook(BookStoreModel bookStoreModel);

    BookStoreModel reserveBookById(BookStoreModel bookStoreModel);
}
