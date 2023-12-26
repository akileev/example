package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.mapper.ClientMapper;
import org.example.model.ClientDto;
import org.example.repository.ClientRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository repository;
    private final ClientMapper mapper;

    public List<ClientDto> getAll(Pageable pageable) {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }
}
