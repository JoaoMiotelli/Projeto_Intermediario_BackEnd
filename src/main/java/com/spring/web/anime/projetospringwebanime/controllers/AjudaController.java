package com.spring.web.anime.projetospringwebanime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.web.anime.projetospringwebanime.models.AjudaDTO;
import com.spring.web.anime.projetospringwebanime.services.AjudaService;

@RestController
@RequestMapping("/api")
public class AjudaController {

    @Autowired
    private AjudaService ajudaService;

    @GetMapping("/ajuda")
    public AjudaDTO obterAjuda() {
        return ajudaService.getAjuda();
    }
}