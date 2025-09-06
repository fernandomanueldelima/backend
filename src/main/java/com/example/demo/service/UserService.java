package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public Page<User> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public User getById(String id) {
        return repository.findById(id).orElse(null);
    }

    public User create(User user) {
        return repository.save(user);
    }

    public User update(String id, User user) {
        user.setId(id);
        return repository.save(user);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
