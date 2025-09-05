package com.example.demo.service;

import com.example.demo.model.EmbeddedMovie;
import com.example.demo.repository.EmbeddedMovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmbeddedMovieService {
    private final EmbeddedMovieRepository repository;

    public EmbeddedMovieService(EmbeddedMovieRepository repository) {
        this.repository = repository;
    }

    public List<EmbeddedMovie> getAll() {
        return repository.findAll();
    }

    public EmbeddedMovie getById(String id) {
        return repository.findById(id).orElse(null);
    }

    public EmbeddedMovie create(EmbeddedMovie movie) {
        return repository.save(movie);
    }

    public EmbeddedMovie update(String id, EmbeddedMovie movie) {
        movie.setId(id);
        return repository.save(movie);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
