package org.example.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ClientServiceTest {
    @Autowired
    private ClientService service;

    @Test
    public void whenGetAllThenReturnCorrectValue() {
        var actual = service.getAll(Pageable.ofSize(1));
        assertThat(actual).isNotEmpty();
    }
}