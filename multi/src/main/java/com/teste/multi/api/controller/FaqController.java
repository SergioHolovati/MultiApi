package com.teste.multi.api.controller;

import com.teste.multi.api.model.request.DuvidaRequest;
import com.teste.multi.domain.model.Duvida;
import com.teste.multi.domain.model.Produto;
import com.teste.multi.domain.service.FaqService;
import com.teste.multi.domain.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/rest/faq")
public class FaqController {

    @Autowired
    private FaqService faqService;

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produto/{produto}")
    public Optional<Produto> produto(@PathVariable String produto){
        return produtoService.getProduto(produto);
    }

    @PostMapping("/ajuda")
    public Optional<Duvida> ajuda(@RequestBody DuvidaRequest duvidaRequest){
        return faqService.getAjuda(duvidaRequest);
    }


}
