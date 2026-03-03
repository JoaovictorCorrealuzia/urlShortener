package com.joaovictor.urlshortener.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepositories extends MongoRepository<com.joaovictor.urlshortener.entities.UrlRepositories, String> {
}
