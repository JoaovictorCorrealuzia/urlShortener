package com.joaovictor.urlshortener.controller;

import com.joaovictor.urlshortener.dtos.ShortenerUrlRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping(value="/shortener-url")
    public ResponseEntity<Void> shortenUrl(@RequestBody ShortenerUrlRequest request) {



        return ResponseEntity.ok().build();
    }
}
