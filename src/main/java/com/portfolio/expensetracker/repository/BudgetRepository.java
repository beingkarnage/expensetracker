package com.portfolio.expensetracker.repository;

import com.portfolio.expensetracker.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
