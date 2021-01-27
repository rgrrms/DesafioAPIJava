package com.desafio.javaapi.service;

import com.desafio.javaapi.model.BookStoreModel;
import com.desafio.javaapi.model.ClientModel;

import java.util.List;

public interface ClientService {

    Object createClient(ClientModel clientModel);

    public List<BookStoreModel>  getBooksByIdClient(String id_client);
}
