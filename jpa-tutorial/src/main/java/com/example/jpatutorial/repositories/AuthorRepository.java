package com.example.jpatutorial.repositories;

import com.example.jpatutorial.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {



}
