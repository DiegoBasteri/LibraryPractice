package com.example.IronLibrary.Repositories;

import com.example.IronLibrary.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository <Author,Integer> {
}
