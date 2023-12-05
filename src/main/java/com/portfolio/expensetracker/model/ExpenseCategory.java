package com.portfolio.expensetracker.model;

import jakarta.persistence.*;

@Entity(name = "expense_category")
public class ExpenseCategory {
    public ExpenseCategory() {}
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(name = "expense_cat_id")
    private long expenseCategoryId;
    @Column(name = "category_name", nullable = false, unique = true)
    private String category;

    public ExpenseCategory(long expenseCategoryId, String category) {
        this.expenseCategoryId = expenseCategoryId;
        this.category = category;
    }

    public long getExpenseIdCategoryId() {
        return expenseCategoryId;
    }

    public ExpenseCategory setExpenseIdCategoryId(long expenseCategoryId) {
        this.expenseCategoryId = expenseCategoryId;
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
