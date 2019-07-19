package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Technology;

public interface TechnologyRepository extends MongoRepository<Technology, String> {

}
