package com.example.demo.controller;

import com.example.demo.model.EmbeddedMovie;
import com.example.demo.service.EmbeddedMovieService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/embedded_movies")
@CrossOrigin(origins = "*")
public class EmbeddedMovieController {

    private final EmbeddedMovieService service;

    public EmbeddedMovieController(EmbeddedMovieService service) {
        this.service = service;
    }

    @GetMapping
    public Page<EmbeddedMovie> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "email") String field
    ) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(field).descending());
        return service.getAll(pageable);
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
