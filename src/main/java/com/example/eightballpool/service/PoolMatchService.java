package com.example.eightballpool.service;

import com.example.eightballpool.model.Match;
import com.example.eightballpool.repository.PoolMatchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoolMatchService {

    private final PoolMatchRepository repository;

    public PoolMatchService(PoolMatchRepository repository) {
        this.repository = repository;
    }

    public List<Match> getAllMatches() {
        return repository.findAll();
    }

    public void deleteMatch(Long id) {
        repository.deleteById(id);
    }

    public void addMatch(Match match) {
        repository.save(match);
    }
}