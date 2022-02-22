package com.teste.multi.domain.service;

import com.teste.multi.domain.model.Produto;
import com.teste.multi.domain.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Optional<Produto> getProduto(String param){
        Optional<Produto> produto = repository.getAllProdutoByParameterLike(param);
        return  produto;
    }
}
