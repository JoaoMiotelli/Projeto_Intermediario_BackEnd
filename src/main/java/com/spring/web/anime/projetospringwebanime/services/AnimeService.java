package com.spring.web.anime.projetospringwebanime.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AnimeService {
    private final RestTemplate restTemplate;

    public AnimeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getAnimeFact() {
        String url = "https://anime-facts-rest-api.herokuapp.com/api/v1/random";
        return restTemplate.getForObject(url, String.class);
    }

    public String processData(String data) {
        return "Dados processados: " + data;
    }
}
