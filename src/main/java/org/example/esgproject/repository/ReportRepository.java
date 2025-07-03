package org.example.esgproject.repository;

import org.example.esgproject.domain.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByUserId(String userId);
}
