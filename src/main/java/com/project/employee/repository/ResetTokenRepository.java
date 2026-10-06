package com.project.employee.repository;

import com.project.employee.model.ResetToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResetTokenRepository extends JpaRepository<ResetToken,Integer> {

    @Query("select r from ResetToken r where r.token=?1 ")
    public ResetToken FindByToken(String token);

    public Optional<ResetToken> findByToken(String token);
    public Optional<ResetToken> findByEmail(String email);
    public void deleteByToken(String token);
}
