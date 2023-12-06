package com.portfolio.expensetracker.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "expense_category")
public class ExpenseCategory {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(name = "expense_cat_id")
    private long expenseCategoryId;
    @Column(name = "category_name", nullable = false, unique = true)
    private String category;
}
