package com.example.demo.repository;

import com.example.demo.model.Theater;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TheaterRepository extends MongoRepository<Theater, String> {
}
