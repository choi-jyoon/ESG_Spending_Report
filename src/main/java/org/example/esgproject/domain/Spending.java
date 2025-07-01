package org.example.esgproject.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Spending {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private  int amount;

    public Spending() {}

    public Spending(String category, int amount) {
        this.category = category;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return  amount;
    }
}
