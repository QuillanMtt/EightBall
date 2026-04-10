package com.example.eightballpool.repository;

import com.example.eightballpool.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoolMatchRepository extends JpaRepository<Match, Long> {
    // No changes needed
}