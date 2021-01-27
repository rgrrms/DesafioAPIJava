package com.desafio.javaapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class ClientModel {

    @Id
    private String id;

    private String name;
}

