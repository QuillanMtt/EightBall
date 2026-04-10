package com.example.eightballpool.controller;

import com.example.eightballpool.model.Match;
import com.example.eightballpool.repository.PoolMatchRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/matches")
public class PoolMatchController {

    private final PoolMatchRepository matchRepository;

    public PoolMatchController(PoolMatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @GetMapping
    public String getMatches(Model model) {
        List<Match> matches = matchRepository.findAll();
        model.addAttribute("matches", matches);
        model.addAttribute("newMatch", new Match()); // For the form
        return "matches"; // matches.html
    }

    @PostMapping("/add")
    public String addMatch(@ModelAttribute("newMatch") Match match) {
        matchRepository.save(match);
        return "redirect:/matches";
    }

    @PostMapping("/delete/{id}")
    public String deleteMatch(@PathVariable Long id) {
        matchRepository.deleteById(id);
        return "redirect:/matches";
    }
}