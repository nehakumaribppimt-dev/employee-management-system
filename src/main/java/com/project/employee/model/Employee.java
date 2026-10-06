package com.project.employee.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String designation;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false)
    private double salary;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique= true)
    private String username;

    @Column(nullable = false, unique= true)
    private String contact;

    @ManyToOne()
    @JoinColumn(name="manager_id")
    private Manager manager;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Leave> leave;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Duty> duty;
}
