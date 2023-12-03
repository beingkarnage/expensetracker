package com.portfolio.expensetracker.model;

import com.portfolio.expensetracker.repository.ExpenseRepository;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "expense")
public class Expense {
    public Expense() {}
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
    private long expenseId;
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
    private User user;
    @Column(
            name = "description",
            columnDefinition = "TEXT"
    )
    private String description;
    @ManyToOne(cascade = CascadeType.ALL) //test
    @JoinColumn(name = "expense_cat_id", nullable = false)
    private ExpenseCategory categoryId;
    @Temporal(TemporalType.DATE) // take date time now()
    private LocalDate date;

    public Expense(long expendId, double amount,
                   String currency, User user,
                   String description, ExpenseCategory categoryId,
                   LocalDate date) {

        this.expenseId = expendId;
        this.amount = amount;
        this.currency = currency;
        this.user = user;
        this.description = description;
        this.categoryId = categoryId;
        this.date = date;
    }

    public long getExpenseId() {
        return expenseId;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public User getUserId() {
        return user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExpenseCategory getCategoryId() {
        return categoryId;
    }

    public LocalDate getDate() {
        return date;
    }

    public Expense setExpenseId(long expendId) {
        this.expenseId = expendId;
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
        this.user = userId;
        return this;
    }

    public Expense setCategoryId(ExpenseCategory categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Expense setDate(LocalDate date) {
        this.date = date;
        return this;
    }

}
