package com.portfolio.expensetracker.model;

import jakarta.persistence.*;

@Entity(name = "expense_category")
public class ExpenseCategory {
    public ExpenseCategory() {}
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "expense_sequence" //test
    )
    @Column(name = "expense_cat_id")
    private long expenseIdCategoryId;
    @Column(name = "category_name", nullable = false, unique = true)
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
