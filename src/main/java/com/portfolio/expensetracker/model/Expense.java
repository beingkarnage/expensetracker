package com.portfolio.expensetracker.model;

import com.portfolio.expensetracker.repository.ExpenseRepository;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "expense")
public class Expense {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
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
}
