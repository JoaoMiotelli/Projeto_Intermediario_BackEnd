package com.spring.web.anime.projetospringwebanime.services;

import org.springframework.stereotype.Service;

import com.spring.web.anime.projetospringwebanime.models.AjudaDTO;

@Service
public class AjudaService {

    public AjudaDTO getAjuda() {
        AjudaDTO ajuda = new AjudaDTO();
        ajuda.setEstudante("Seu Nome");
        ajuda.setProjeto("Nome do Projeto");
        return ajuda;
    }
}