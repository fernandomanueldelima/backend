package com.example.demo.controller;

import com.example.demo.model.Theater;
import com.example.demo.service.TheaterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theaters")
public class TheaterController {
    private final TheaterService service;

    public TheaterController(TheaterService service) {
        this.service = service;
    }

    @GetMapping public List<Theater> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public Theater getById(@PathVariable String id) { return service.getById(id); }
    @PostMapping public Theater create(@RequestBody Theater theater) { return service.create(theater); }
    @PutMapping("/{id}") public Theater update(@PathVariable String id, @RequestBody Theater theater) { return service.update(id, theater); }
    @DeleteMapping("/{id}") public void delete(@PathVariable String id) { service.delete(id); }
}
