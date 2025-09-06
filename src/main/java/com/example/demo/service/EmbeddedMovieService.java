package com.example.demo.service;

import com.example.demo.model.EmbeddedMovie;
import com.example.demo.repository.EmbeddedMovieRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmbeddedMovieService {
    private final EmbeddedMovieRepository repository;

    public EmbeddedMovieService(EmbeddedMovieRepository repository) {
        this.repository = repository;
    }

    public Page<EmbeddedMovie> getAll(Pageable pageable) {
        return repository.findAll(pageable);
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
