package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping public Page<Movie> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "title") String field
    ) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(field).descending());
        return service.getAll(pageable);
    }
    @GetMapping("/{id}") public Movie getById(@PathVariable String id) { return service.getById(id); }
    @PostMapping public Movie create(@RequestBody Movie movie) { return service.create(movie); }
    @PutMapping("/{id}") public Movie update(@PathVariable String id, @RequestBody Movie movie) { return service.update(id, movie); }
    @DeleteMapping("/{id}") public void delete(@PathVariable String id) { service.delete(id); }
}
