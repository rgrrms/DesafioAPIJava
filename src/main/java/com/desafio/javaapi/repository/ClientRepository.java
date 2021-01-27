package com.desafio.javaapi.repository;

import com.desafio.javaapi.model.BookStoreModel;
import com.desafio.javaapi.model.ClientModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ClientRepository extends MongoRepository<ClientModel, String> {

    @Query("{ $and: [ { client: { id: ?0 } } ] }")
    public List<BookStoreModel> findAllByIdClient(String id_client);

}
