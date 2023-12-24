package org.example.web;

import org.example.model.ClientDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientApplication {
    @GetMapping
    public ResponseEntity<?> index() {
        return ResponseEntity.ok(List.of(ClientDto.builder().id(UUID.randomUUID()).build()));
    }
}
