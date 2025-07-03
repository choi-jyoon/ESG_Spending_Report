package org.example.esgproject.controller;

import org.example.esgproject.domain.Report;
import org.example.esgproject.dto.ReportSaveRequest;
import org.example.esgproject.repository.ReportRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
public class ReportController {

    private final ReportRepository repository;

    public ReportController(ReportRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/save")
    public String save(@RequestBody ReportSaveRequest req) {
        Report report = new Report(
                req.getUserId(),
                req.getEnvironment(),
                req.getSocial(),
                req.getGovernance(),
                req.getGrade(),
                req.getMessage()
        );
        repository.save(report);
        return "저장 완료";
    }

    @GetMapping("/{userId}")
    public List<Report> getReports(@PathVariable String userId) {
        return repository.findByUserId(userId);
    }

}
