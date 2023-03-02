package com.example.IronLibrary.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student {
    @Id
    private String usn;
    private String name;

    public Student() {
    }

    public Student(String usn, String name) {
        this.usn = usn;
        this.name = name;
    }

}
