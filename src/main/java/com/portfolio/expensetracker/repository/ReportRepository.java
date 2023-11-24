package com.portfolio.expensetracker.repository;

import com.portfolio.expensetracker.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
}
