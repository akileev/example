package org.example.web;

import lombok.RequiredArgsConstructor;
import org.example.model.ClientDto;
import org.example.service.ClientService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/clients")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping
    public ResponseEntity<?> index(Pageable pageable) {
        return ResponseEntity.ok(clientService.getAll(pageable));
    }

    @PostMapping
    public ResponseEntity<?> create(ClientDto client) {
        return ResponseEntity.ok(clientService.create(client));
    }

    @PutMapping
    public ResponseEntity<?> update(ClientDto client) {
        return ResponseEntity.ok(clientService.update(client));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") UUID id) {
        clientService.delete(id);
    }
}
