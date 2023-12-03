package com.portfolio.expensetracker.repository;

import com.portfolio.expensetracker.model.Expense;
import com.portfolio.expensetracker.model.ExpenseCategory;
import com.portfolio.expensetracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    public List<Expense> findByUser(User user);
    public List<Expense> findByUserAndCategoryId(User user, ExpenseCategory expenseCategoryId);
}