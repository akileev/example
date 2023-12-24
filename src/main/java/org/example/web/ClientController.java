package org.example.web;

import lombok.RequiredArgsConstructor;
import org.example.service.ClientService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clients")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping
    public ResponseEntity<?> index(Pageable pageable) {
        return ResponseEntity.ok(clientService.getAll(pageable));
    }
}
