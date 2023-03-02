package com.example.IronLibrary.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer authorId;
    private String name;
    private String email;

    @OneToOne
    @JsonIgnore
    private Book authorBook;

    public Author(String name, String email, Book authorBook) {
        this.name = name;
        this.email = email;
        this.authorBook = authorBook;
    }

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", authorBook=" + authorBook +
                '}';
    }
}
