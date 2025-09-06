package com.example.demo.service;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public Page<Movie> getAll(Pageable pageable) { return repository.findAll(pageable); }
    public Movie getById(String id) { return repository.findById(id).orElse(null); }
    public Movie create(Movie movie) { return repository.save(movie); }
    public Movie update(String id, Movie movie) { movie.setId(id); return repository.save(movie); }
    public void delete(String id) { repository.deleteById(id); }
}
