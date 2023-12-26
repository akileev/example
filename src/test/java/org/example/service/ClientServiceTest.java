package org.example.service;

import org.example.model.ClientDto;
import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ClientServiceTest {
    @Autowired
    private ClientService service;

    private final EasyRandom easyRandom = new EasyRandom();

    @Test
    public void whenGetAllThenSuccess() {
        var actual = service.getAll(Pageable.ofSize(1));
        assertThat(actual).isEmpty();
    }

    @Test
    public void whenCreateThenSuccess() {
        var client = easyRandom.nextObject(ClientDto.class);
        client.setId(null);
        var actual = service.create(client);
        assertThat(actual.getId()).isNotNull();
    }
}