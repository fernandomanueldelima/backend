package com.example.demo.controller;

import com.example.demo.model.Comment;
import com.example.demo.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @GetMapping public List<Comment> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public Comment getById(@PathVariable String id) { return service.getById(id); }
    @PostMapping public Comment create(@RequestBody Comment comment) { return service.create(comment); }
    @PutMapping("/{id}") public Comment update(@PathVariable String id, @RequestBody Comment comment) { return service.update(id, comment); }
    @DeleteMapping("/{id}") public void delete(@PathVariable String id) { service.delete(id); }
}
