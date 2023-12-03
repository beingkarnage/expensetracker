package com.portfolio.expensetracker.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "expense")
public class Expense {
    @Id
    @SequenceGenerator(
            name="expense_sequence",
            sequenceName = "expense_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "expense_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private long expendId;
    @Column(
            name = "amount",
            nullable = false
    )
    private double amount;
    @Column(
            name = "currency",
            nullable = false
    )
    private String currency;

    @ManyToOne(cascade = CascadeType.ALL) // check
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;
    @Column(
            name = "description",
            columnDefinition = "TEXT"
    )
    private String description;
    @Column(
            name = "category_id",
            nullable = false
    )
    private String categoryId;
    @Temporal(TemporalType.DATE) // take date time now()
    private LocalDate date;

    public Expense(long expendId, double amount,
                   String currency, User userId,
                   String description, String categoryId,
                   LocalDate date) {

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

    public User getUserId() {
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

    public Expense setUserId(User userId) {
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
