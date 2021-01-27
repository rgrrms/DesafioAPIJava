package com.desafio.javaapi.service.Impl;

import com.desafio.javaapi.model.BookStoreModel;
import com.desafio.javaapi.model.ClientModel;
import com.desafio.javaapi.repository.BookStoreRepository;
import com.desafio.javaapi.repository.ClientRepository;
import com.desafio.javaapi.service.BookStoreService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BookStoreServiceImpl implements BookStoreService {


    private final BookStoreRepository bookStoreRepository;
    private final ClientRepository clientRepository;

    public BookStoreServiceImpl(BookStoreRepository bookStoreRepository, ClientRepository clientRepository) {
        this.bookStoreRepository = bookStoreRepository;
        this.clientRepository = clientRepository;
    }

    @Override
    public List<BookStoreModel> getAllBooks() {
        return this.bookStoreRepository.findAll();
    }

    @Override
    public BookStoreModel addBook(BookStoreModel bookStoreModel) {
        return this.bookStoreRepository.save(bookStoreModel);
    }

    @Override
    public BookStoreModel reserveBookById(BookStoreModel bookStoreModel) {
        Optional<BookStoreModel> book = this.bookStoreRepository.findById(bookStoreModel.getId());
        if (book.isPresent()) {
            bookStoreModel.setName(bookStoreModel.getName());
            bookStoreModel.setStatus("emprestado");
            bookStoreModel.setDate(LocalDate.now());
            ClientModel client = this.clientRepository.findById(bookStoreModel.getClient().getId())
                    .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));
            bookStoreModel.setClient(client);
            bookStoreRepository.save(bookStoreModel);
            return bookStoreModel;
        }
        return null;
    }
}
