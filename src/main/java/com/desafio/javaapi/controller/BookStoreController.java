package com.desafio.javaapi.controller;

import com.desafio.javaapi.model.BookStoreModel;
import com.desafio.javaapi.service.BookStoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookStoreController {

    private final BookStoreService bookStoreService;

    public BookStoreController(BookStoreService bookStoreService) {
        this.bookStoreService = bookStoreService;
    }

    @GetMapping
    public ResponseEntity<List<BookStoreModel>> getAllBooks() {
        return ResponseEntity.ok(this.bookStoreService.getAllBooks());
    }

    @PutMapping("/{id}/reserve")
    public BookStoreModel reserveBook(@PathVariable String id, @RequestBody BookStoreModel bookStoreModel) {
        bookStoreModel.setId(id);
        return this.bookStoreService.reserveBookById(bookStoreModel);
    }

    @PostMapping
    public ResponseEntity<BookStoreModel> addBook(@RequestBody BookStoreModel bookStoreModel) {
        return ResponseEntity.ok(this.bookStoreService.addBook(bookStoreModel));
    }
}
