package com.portfolio.expensetracker.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "budget")
public class Budget {

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
}
