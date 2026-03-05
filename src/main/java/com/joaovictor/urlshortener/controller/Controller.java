package com.joaovictor.urlshortener.controller;

import com.joaovictor.urlshortener.dtos.ShortenerUrlRequest;
import com.joaovictor.urlshortener.services.UrlService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    final UrlService urlService;

    public Controller(UrlService urlService) {
        this.urlService = urlService;
    }


    @PostMapping(value="/shortener-url")
    public ResponseEntity<Void> shortenUrl(@RequestBody ShortenerUrlRequest request, HttpServletRequest servletRequest) {
        var redirectUrl = servletRequest.getRequestURL().toString().replace("shortener-url",urlService.shortenUrl(request));

        return ResponseEntity.ok().build();
    }
}
