package com.portfolio.expensetracker.model;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Budget {
    private long budgetId;
    private long userId;
    private long categoryId;
    private double amount;
    private String period;
    private LocalDate startData;
    private LocalDate endDate;

    public Budget(long budgetId, long userId,
                  long categoryId, double amount,
                  String period, LocalDate startData,
                  LocalDate endDate) {
        this.budgetId = budgetId;
        this.userId = userId;
        this.categoryId = categoryId;
        this.amount = amount;
        this.period = period;
        this.startData = startData;
        this.endDate = endDate;
    }

    public long getBudgetId() {
        return budgetId;
    }

    public Budget setBudgetId(long budgetId) {
        this.budgetId = budgetId;
        return this;
    }

    public long getUserId() {
        return userId;
    }

    public Budget setUserId(long userId) {
        this.userId = userId;
        return this;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public Budget setCategoryId(long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Budget setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public String getPeriod() {
        return period;
    }

    public Budget setPeriod(String period) {
        this.period = period;
        return this;
    }

    public LocalDate getStartData() {
        return startData;
    }

    public Budget setStartData(LocalDate startData) {
        this.startData = startData;
        return this;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Budget setEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
}
