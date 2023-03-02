package com.example.IronLibrary.Repositories;

import com.example.IronLibrary.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository <Book,Integer> {
}
