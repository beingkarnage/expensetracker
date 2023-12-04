package com.portfolio.expensetracker.service;


import com.portfolio.expensetracker.model.Expense;
import com.portfolio.expensetracker.model.ExpenseCategory;
import com.portfolio.expensetracker.model.User;
import com.portfolio.expensetracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    private ExpenseRepository expenseRepository;
    public List<Expense> getAllExpense() {
        return expenseRepository.findAll();
    }
    public Expense getExpenseById(Long expenseId) {
        return expenseRepository.findById(expenseId).orElse(null);
    }
    public void saveExpense(Expense expense) {
        expenseRepository.save(expense);
    }
    public void deleteExpense(Expense expense) {
        expenseRepository.delete(expense);
    }
    public List<Expense> getExpenseByUserId(User user) {
        return expenseRepository.findByUser(user);
    }
    public List<Expense> getExpenseByUserAndCategory(User user, ExpenseCategory expenseCategory) {
     return expenseRepository.findByUserAndCategoryId(user, expenseCategory);
    }
}
