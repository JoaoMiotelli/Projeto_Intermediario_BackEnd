package com.spring.web.anime.projetospringwebanime.services;

import org.springframework.stereotype.Service;

import com.spring.web.anime.projetospringwebanime.models.AjudaDTO;

@Service
public class AjudaService {

    public AjudaDTO getAjuda() {
        AjudaDTO ajuda = new AjudaDTO();
        ajuda.setEstudante("João Victor Miotelli Vitali");
        ajuda.setProjeto("Projeto Itermediário Anime API");
        return ajuda;
    }
}
