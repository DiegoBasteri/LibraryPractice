package com.example.IronLibrary.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Issue {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer IssueId;
    private String issueDate;
    private String returnDate;

    @OneToOne
    private Student issueStudent;

    @OneToOne
    private Book issueBook;

    public Issue(String issueDate, String returnDate, Student issueStudent, Book issueBook) {
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.issueStudent = issueStudent;
        this.issueBook = issueBook;
    }
}
