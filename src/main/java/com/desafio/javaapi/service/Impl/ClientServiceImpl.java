package com.desafio.javaapi.service.Impl;

import com.desafio.javaapi.model.BookStoreModel;
import com.desafio.javaapi.model.ClientModel;
import com.desafio.javaapi.repository.BookStoreRepository;
import com.desafio.javaapi.repository.ClientRepository;
import com.desafio.javaapi.service.ClientService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final BookStoreRepository bookStoreRepository;

    public ClientServiceImpl(ClientRepository clientRepository, BookStoreRepository bookStoreRepository) {
        this.clientRepository = clientRepository;
        this.bookStoreRepository = bookStoreRepository;
    }

    @Override
    public Object createClient(ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }

    @Override
    public List<BookStoreModel> getBooksByIdClient(String id_client) {
        List<BookStoreModel> books = this.clientRepository.findAllByIdClient(id_client);
        LocalDate today = LocalDate.now();
        //Faltou o calculo dos dias com a multa
        return books;
    }
}
