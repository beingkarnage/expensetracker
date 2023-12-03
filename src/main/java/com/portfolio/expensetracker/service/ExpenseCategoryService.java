package com.portfolio.expensetracker.service;

import com.portfolio.expensetracker.model.ExpenseCategory;
import com.portfolio.expensetracker.repository.ExpenseCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseCategoryService {
    @Autowired
    private ExpenseCategoryRepository expenseCategoryRepository;
    public List<ExpenseCategory> getAllExpenseCategory() {
        return expenseCategoryRepository.findAll();
    }

    public ExpenseCategory getExpenseCategoryById(Long expenseCategoryId) {
        return expenseCategoryRepository.findById(expenseCategoryId).orElse(null);
    }

    public void saveExpenseCategory(ExpenseCategory expenseCategory) {
         expenseCategoryRepository.save(expenseCategory);
    }

    public void deleteExpenseCategory(ExpenseCategory expenseCategory) {
        expenseCategoryRepository.delete(expenseCategory);
    }

}
