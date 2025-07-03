package org.example.esgproject.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String userId;
    private int environment;
    private int social;
    private int government;
    private String grade;
    private String message;

    public Report() {}
    public Report(String userId, int environment, int social, int government, String grade, String message) {
        this.userId = userId;
        this.environment = environment;
        this.social = social;
        this.government = government;
        this.grade = grade;
        this.message = message;
    }


}
