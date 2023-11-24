package com.portfolio.expensetracker.repository;

import com.portfolio.expensetracker.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseCategoryRepository extends JpaRepository<Budget, Long> {
}
