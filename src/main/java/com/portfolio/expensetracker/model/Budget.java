package com.portfolio.expensetracker.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "budget")
public class Budget {
    @Id
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "expense_sequence" //test
//    )
    @Column(
            name = "id",
            updatable = false
    )
    private long budgetId;
    @ManyToOne(cascade = CascadeType.ALL) //test
    @JoinColumn(name = "expense_cat_id", nullable = false)
    private ExpenseCategory categoryId;
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
    private LocalDate startData;
    @Column(
            name = "end_date",
            nullable = false
    )
    private LocalDate endDate;

    public Budget(long budgetId,
                  ExpenseCategory categoryId, double amount,
                  String period, LocalDate startData,
                  LocalDate endDate) {
        this.budgetId = budgetId;
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
