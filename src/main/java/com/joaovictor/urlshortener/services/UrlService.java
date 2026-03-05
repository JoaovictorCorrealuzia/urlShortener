package com.joaovictor.urlshortener.services;

import com.joaovictor.urlshortener.dtos.ShortenerUrlRequest;
import com.joaovictor.urlshortener.entities.UrlEntity;
import com.joaovictor.urlshortener.repositories.UrlRepositories;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;

@Service
public class UrlService {
    final UrlRepositories urlRepositories;

    public UrlService(UrlRepositories urlRepositories) {
        this.urlRepositories = urlRepositories;
    }

    public String shortenUrl(@RequestBody ShortenerUrlRequest request){

        String id;
        do {
            id = RandomStringUtils.randomAlphanumeric(5, 10);
        }while (urlRepositories.existsById(id));

        urlRepositories.save(new UrlEntity(id,request.url(), LocalDateTime.now().plusMinutes(1) ));

        return id;
    }
}
