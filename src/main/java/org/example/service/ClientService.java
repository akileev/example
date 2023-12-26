package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.domain.NotFoundException;
import org.example.mapper.ClientMapper;
import org.example.model.ClientDto;
import org.example.repository.ClientRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
@Transactional
public class ClientService {
    private final ClientRepository repository;
    private final ClientMapper mapper;

    @Transactional(readOnly = true)
    public List<ClientDto> getAll(Pageable pageable) {
        return repository.findAll(pageable).stream().map(mapper::toDto).toList();
    }

    public ClientDto create(ClientDto client) {
        return mapper.toDto(repository.save(mapper.toEntity(client)));
    }

    public ClientDto update(ClientDto client) {
        if (!repository.existsById(client.getId())) {
            throw new NotFoundException();
        }

        return mapper.toDto(repository.save(mapper.toEntity(client)));
    }

    public void delete(UUID id) {
        if (!repository.existsById(id)) {
            throw new NotFoundException();
        }

        repository.deleteById(id);
    }
}
