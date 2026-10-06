package com.project.employee.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate enddate;

    @Column(nullable = false)
    private String reason;

    @Column(nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name="emp_id")
    private Employee employee;
}
