package com.project.employee.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="manager_id")
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false)
    private double salary;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique= true)
    private String contact;

    @OneToMany(mappedBy = "manager", cascade = CascadeType.ALL)
    private List<Employee> employee;

    @OneToMany(mappedBy = "assignedByManager" , cascade = CascadeType.ALL)
    private List<Duty> dutiesAssigned;
}
