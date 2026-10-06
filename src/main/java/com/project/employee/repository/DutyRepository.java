package com.project.employee.repository;

import com.project.employee.model.Duty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DutyRepository extends JpaRepository<Duty, Integer> {
}
