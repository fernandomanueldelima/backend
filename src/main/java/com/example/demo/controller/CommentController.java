package com.example.demo.controller;

import com.example.demo.model.Comment;
import com.example.demo.service.CommentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @GetMapping public Page<Comment> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "date") String field
    ) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(field).descending());
        return service.getAll(pageable);
    }
    @GetMapping("/{id}") public Comment getById(@PathVariable String id) { return service.getById(id); }
    @PostMapping public Comment create(@RequestBody Comment comment) { return service.create(comment); }
    @PutMapping("/{id}") public Comment update(@PathVariable String id, @RequestBody Comment comment) { return service.update(id, comment); }
    @DeleteMapping("/{id}") public void delete(@PathVariable String id) { service.delete(id); }
}
