package com.spring.web.anime.projetospringwebanime.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.web.anime.projetospringwebanime.services.AnimeService;

@RestController
@RequestMapping("/api")
public class AnimeController {
    
    private final AnimeService animeService;

    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping("/anime-facts")
    public ResponseEntity<String> getAnimeFact() {
        String animeResponse = animeService.getAnimeFact();
        return ResponseEntity.ok(animeResponse);
    }

    @PostMapping("/process-data")
    public ResponseEntity<String> processData(@RequestBody String data) {
        String processedData = animeService.processData(data);
        return ResponseEntity.ok(processedData);
    }
}

