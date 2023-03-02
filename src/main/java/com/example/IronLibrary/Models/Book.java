package com.example.IronLibrary.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.net.Inet4Address;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String isbn;
    private String title;
    private String category;
    private Integer quantity;
    @OneToOne(mappedBy = "authorBook")
    private Author author;

    public Book(String isbn, String title, String category, Integer quantity,Author author) {
        this.isbn = isbn;
        this.title = title;
        this.category = category;
        this.quantity = quantity;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", author=" + author +
                '}';
    }
}

