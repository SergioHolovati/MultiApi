package com.teste.multi.service;


import com.teste.multi.domain.model.Produto;
import com.teste.multi.domain.repository.ProdutoRepository;
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
public class ProdutoServiceTest {

    @Autowired
    private ProdutoRepository repository;

    @Test
    public void getProdutoList(){
        Optional<Produto> produto = repository.getAllProdutoByParameterLike("PC134");
        assertEquals(1, produto.get().getId());
    }

}
