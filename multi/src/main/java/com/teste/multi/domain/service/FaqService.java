package com.teste.multi.domain.service;

import com.teste.multi.api.model.request.DuvidaRequest;
import com.teste.multi.domain.exception.notfound.BusinessException;
import com.teste.multi.domain.model.Duvida;
import com.teste.multi.domain.repository.FaqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FaqService {

    @Autowired
    FaqRepository faqRepository;


    public Optional<Duvida> getAjuda(DuvidaRequest duvidaRequest){

            Optional<Duvida> duvida = faqRepository.getAllBySearch(duvidaRequest.getDuvida());
            if(duvida.isEmpty())
               throw new BusinessException("Desculpe, Não encontramos resposta para sua pergunta! Favor mude-a ou contate a central de atendimento. Obrigado!");
            return  duvida;


    }


}
