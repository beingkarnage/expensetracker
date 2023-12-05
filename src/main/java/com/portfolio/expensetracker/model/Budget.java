package com.portfolio.expensetracker.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "budget")
public class Budget {
    public Budget() {}

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(
            name = "id",
            updatable = false
    )
    private long budgetId;
    @ManyToOne(cascade = CascadeType.ALL) //test
    @JoinColumn(name = "expense_cat_id", nullable = false)
    private ExpenseCategory categoryId;

    @ManyToOne(cascade = CascadeType.ALL) //test
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @Column(
            name = "amount",
            nullable = false
    )
    private double amount;
    @Column(name = "period", nullable = false)
    private String period;
    @Column(
            name = "start_date",
            nullable = false
    )
    private LocalDate startDate;
    @Column(
            name = "end_date",
            nullable = false
    )
    private LocalDate endDate;


    public Budget(long budgetId,
                  ExpenseCategory categoryId,User user,  double amount,
                  String period, LocalDate startDate,
                  LocalDate endDate) {
        this.budgetId = budgetId;
        this.categoryId = categoryId;
        this.amount = amount;
        this.period = period;
        this.startDate = startDate;
        this.endDate = endDate;
        this.user = user;
    }
    public User getUser() {
        return user;
    }

    public Budget setUser(User user) {
        this.user = user;
        return this;
    }
    public long getBudgetId() {
        return budgetId;
    }

    public Budget setBudgetId(long budgetId) {
        this.budgetId = budgetId;
        return this;
    }

    public ExpenseCategory getCategoryId() {
        return categoryId;
    }

    public Budget setCategoryId(ExpenseCategory categoryId) {
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
        return startDate;
    }

    public Budget setStartData(LocalDate startData) {
        this.startDate = startData;
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
