package com.example.demo.controller;

import com.example.demo.model.Theater;
import com.example.demo.service.TheaterService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/theaters")
@CrossOrigin(origins = "*")
public class TheaterController {
    private final TheaterService service;

    public TheaterController(TheaterService service) {
        this.service = service;
    }

    @GetMapping public Page<Theater> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "theaterId") String field
    ) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(field).descending());
        return service.getAll(pageable);
    }
    @GetMapping("/{id}") public Theater getById(@PathVariable String id) { return service.getById(id); }
    @PostMapping public Theater create(@RequestBody Theater theater) { return service.create(theater); }
    @PutMapping("/{id}") public Theater update(@PathVariable String id, @RequestBody Theater theater) { return service.update(id, theater); }
    @DeleteMapping("/{id}") public void delete(@PathVariable String id) { service.delete(id); }
}
