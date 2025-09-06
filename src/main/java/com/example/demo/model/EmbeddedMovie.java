package com.example.demo.model;

import com.example.demo.dto.MovieDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "embedded_movies")
public class EmbeddedMovie extends MovieDto {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}