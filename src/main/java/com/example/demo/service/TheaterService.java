package com.example.demo.service;

import com.example.demo.model.Theater;
import com.example.demo.repository.TheaterRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheaterService {
    private final TheaterRepository repository;

    public TheaterService(TheaterRepository repository) {
        this.repository = repository;
    }

    public Page<Theater> getAll(Pageable pageable) { return repository.findAll(pageable); }
    public Theater getById(String id) { return repository.findById(id).orElse(null); }
    public Theater create(Theater theater) { return repository.save(theater); }
    public Theater update(String id, Theater theater) { theater.setId(id); return repository.save(theater); }
    public void delete(String id) { repository.deleteById(id); }
}
