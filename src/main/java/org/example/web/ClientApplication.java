package org.example.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientApplication {
    @GetMapping
    public ResponseEntity<?> index() {
        return ResponseEntity.ok(List.of());
    }
}
