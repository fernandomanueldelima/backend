package com.example.demo.repository;

import com.example.demo.model.EmbeddedMovie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmbeddedMovieRepository extends MongoRepository<EmbeddedMovie, String> {
}