package com.teste.multi.service;


import com.teste.multi.domain.model.Cliente;
import com.teste.multi.domain.model.Duvida;
import com.teste.multi.domain.repository.ClienteRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ClienteServiceTest {

    @Autowired
    ClienteRepository repository;

    @Test
    public void getClient(){
        Optional<Cliente> cliente = repository.findById(Long.parseLong("1"));
        assertEquals(1, cliente.get().getId());
        assertEquals("Test User", cliente.get().getNome());
        assertEquals("5", cliente.get().getAvaliacao().toString());
    }

}

