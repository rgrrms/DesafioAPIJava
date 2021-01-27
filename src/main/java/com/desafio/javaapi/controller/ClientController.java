package com.desafio.javaapi.controller;

import com.desafio.javaapi.model.ClientModel;
import com.desafio.javaapi.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<Object> createClient(@RequestBody ClientModel clientModel) {
        return ResponseEntity.ok(this.clientService.createClient(clientModel));
    }

    @GetMapping("/{id_client}/books")
    public ResponseEntity<Object> getBooksByClient(@PathVariable String id_client) {
        return ResponseEntity.ok(this.clientService.getBooksByIdClient(id_client));
    }
}

