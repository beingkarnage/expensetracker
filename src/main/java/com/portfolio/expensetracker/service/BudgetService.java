package com.portfolio.expensetracker.service;

import com.portfolio.expensetracker.model.Budget;
import com.portfolio.expensetracker.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {
    @Autowired
    private BudgetRepository budgetRepository;
    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }
    public Budget getBudgetById(Long userId) {
        return budgetRepository.findById(userId).orElse(null);
    }

    public void saveBudget(Budget budget) {
        budgetRepository.save(budget);
    }
    public void deleteBudget(Budget budget) {
        budgetRepository.delete(budget);
    }
}
