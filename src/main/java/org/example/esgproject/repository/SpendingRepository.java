package org.example.esgproject.repository;

import org.example.esgproject.domain.Spending;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpendingRepository extends JpaRepository<Spending, Long> {
}
