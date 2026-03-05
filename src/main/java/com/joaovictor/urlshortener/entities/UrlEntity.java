package com.joaovictor.urlshortener.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Document(collation = "urls")
public class UrlEntity {
    @Id
    private String id;

    private String fullurl;
    @Indexed(expireAfter = "0s")

    private LocalDateTime expiresAt;

    public UrlEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullurl() {
        return fullurl;
    }

    public void setFullurl(String fullurl) {
        this.fullurl = fullurl;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public UrlEntity(String id, String fullurl, LocalDateTime expiresAt) {
        this.id = id;
        this.fullurl = fullurl;
        this.expiresAt = expiresAt;
    }
}
