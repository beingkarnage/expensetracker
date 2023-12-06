package com.portfolio.expensetracker.repository;

import com.portfolio.expensetracker.model.ExpenseCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseCategoryRepository extends JpaRepository<ExpenseCategory, Long> {
    public ExpenseCategory findByCategory(String category);

}
