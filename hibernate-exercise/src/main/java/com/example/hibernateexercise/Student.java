package com.example.hibernateexercise;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "FIRSTNAME")
    @NonNull
    private String firstName;

    @Column(name = "LASTNAME")
    @NonNull
    private String lastName;

    @Column(name = "EMAIL")
    @NonNull
    private String email;
}
