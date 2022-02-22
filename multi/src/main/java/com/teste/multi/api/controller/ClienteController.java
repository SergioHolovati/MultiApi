package com.teste.multi.api.controller;


import com.teste.multi.domain.model.Cliente;
import com.teste.multi.domain.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    public String save(@RequestBody Cliente cliente){
        return  service.save(cliente);
    }

}
