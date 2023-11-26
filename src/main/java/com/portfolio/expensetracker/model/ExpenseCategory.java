package com.portfolio.expensetracker.model;

import jakarta.persistence.Entity;

@Entity
public class ExpenseCategory {
    private long expenseIdCategoryId;
    private String category;

    public ExpenseCategory(long expenseIdCategoryId, String category) {
        this.expenseIdCategoryId = expenseIdCategoryId;
        this.category = category;
    }

    public long getExpenseIdCategoryId() {
        return expenseIdCategoryId;
    }

    public ExpenseCategory setExpenseIdCategoryId(long expenseIdCategoryId) {
        this.expenseIdCategoryId = expenseIdCategoryId;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public ExpenseCategory setCategory(String category) {
        this.category = category;
        return this;
    }
}
