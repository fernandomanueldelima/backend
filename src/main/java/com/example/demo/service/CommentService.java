package com.example.demo.service;

import com.example.demo.model.Comment;
import com.example.demo.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository repository;

    public CommentService(CommentRepository repository) {
        this.repository = repository;
    }

    public List<Comment> getAll() { return repository.findAll(); }
    public Comment getById(String id) { return repository.findById(id).orElse(null); }
    public Comment create(Comment comment) { return repository.save(comment); }
    public Comment update(String id, Comment comment) { comment.setId(id); return repository.save(comment); }
    public void delete(String id) { repository.deleteById(id); }
}
