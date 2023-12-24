package org.example.service;

import org.example.model.ClientDto;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ClientService {
    public List<ClientDto> getAll(Pageable pageable) {
        return List.of(ClientDto.builder().id(UUID.randomUUID()).build());
    }
}
