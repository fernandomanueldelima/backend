package com.example.demo.controller;

import com.example.demo.model.EmbeddedMovie;
import com.example.demo.service.EmbeddedMovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/embedded_movies")
public class EmbeddedMovieController {

    private final EmbeddedMovieService service;

    public EmbeddedMovieController(EmbeddedMovieService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmbeddedMovie> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public EmbeddedMovie getById(@PathVariable String id) {
        return service.getById(id);
    }

    @PostMapping
    public EmbeddedMovie create(@RequestBody EmbeddedMovie movie) {
        return service.create(movie);
    }

    @PutMapping("/{id}")
    public EmbeddedMovie update(@PathVariable String id, @RequestBody EmbeddedMovie movie) {
        return service.update(id, movie);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
