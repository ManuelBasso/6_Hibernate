package com.example.hibernateexercise.tables;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Student s;

    @ManyToOne
    private Class c;
}
