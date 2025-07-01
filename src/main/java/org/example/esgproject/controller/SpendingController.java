package org.example.esgproject.controller;

import org.example.esgproject.domain.Spending;
import org.example.esgproject.dto.SpendingDTO;
import org.example.esgproject.repository.SpendingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/spending")
public class SpendingController {
    private final SpendingRepository repository;

    public SpendingController(SpendingRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public String addSpending(@RequestBody SpendingDTO spendingdto) {
        Spending spending = new Spending(spendingdto.getCategory(), spendingdto.getAmount());
        repository.save(spending);
        return "success";
    }

    @GetMapping
    public List<Spending> getAll() {
        return repository.findAll();
    }
}
