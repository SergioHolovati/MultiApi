package com.teste.multi.domain.service;

import com.teste.multi.domain.exception.notfound.BusinessException;
import com.teste.multi.domain.model.Cliente;
import com.teste.multi.domain.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public String save(Cliente cliente){

        if(cliente.getAvaliacao() ==  null ||  cliente.getNome() == null  || cliente.getPergunta() == null)
            throw new BusinessException("Impossível salvar cliente!");
        try{
        repository.save(cliente);
            return "Cliente salvo com sucesso";
        }catch (Exception e){
            throw new BusinessException("Impossível salvar cliente!");
        }

    }
}
