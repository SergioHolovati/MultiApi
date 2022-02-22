package com.teste.multi.service;

import com.teste.multi.domain.model.Duvida;
import com.teste.multi.domain.repository.FaqRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class FaqServiceTest {

    @Autowired
    private FaqRepository repository;

    @Test
    public void getProdutoList(){
        Optional<Duvida> duvida = repository.getAllBySearch("Quanto tempo devo carregar a bateria antes do uso?");
        assertEquals(1, duvida.get().getId());
    }

}
