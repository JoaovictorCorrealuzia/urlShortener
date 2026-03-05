package com.joaovictor.urlshortener.repositories;

import com.joaovictor.urlshortener.entities.UrlEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepositories extends MongoRepository<UrlEntity, String> {
}
