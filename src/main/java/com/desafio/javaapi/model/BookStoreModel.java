package com.desafio.javaapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class BookStoreModel {

    @Id
    private String id;

    private String name;

    private String status;

    private LocalDate date;

    @DBRef
    private ClientModel client;
}
