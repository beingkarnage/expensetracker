package com.portfolio.expensetracker.model;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Expense {
    private long expendId;
    private double amount;
    private String currency;
    private long userId;
    private String description;
    private String categoryId;
    private LocalDate date;

    public Expense(long expendId, double amount,
                   String currency, long userId,
                   String description, String categoryId,
                   LocalDate date, String username) {

        this.expendId = expendId;
        this.amount = amount;
        this.currency = currency;
        this.userId = userId;
        this.description = description;
        this.categoryId = categoryId;
        this.date = date;
    }

    public long getExpendId() {
        return expendId;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public long getUserId() {
        return userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public LocalDate getDate() {
        return date;
    }

    public Expense setExpendId(long expendId) {
        this.expendId = expendId;
        return this;
    }

    public Expense setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public Expense setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public Expense setUserId(long userId) {
        this.userId = userId;
        return this;
    }

    public Expense setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Expense setDate(LocalDate date) {
        this.date = date;
        return this;
    }

}
