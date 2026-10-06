package com.project.employee.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable=false, unique = true)
    private String username;

    @Column(nullable=false)
    private String password;

    @Column(nullable=false, unique = true)
    private String email;
}
