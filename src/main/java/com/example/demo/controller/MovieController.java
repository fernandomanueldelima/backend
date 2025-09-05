package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping public List<Movie> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public Movie getById(@PathVariable String id) { return service.getById(id); }
    @PostMapping public Movie create(@RequestBody Movie movie) { return service.create(movie); }
    @PutMapping("/{id}") public Movie update(@PathVariable String id, @RequestBody Movie movie) { return service.update(id, movie); }
    @DeleteMapping("/{id}") public void delete(@PathVariable String id) { service.delete(id); }
}
