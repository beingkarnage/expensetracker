package com.portfolio.expensetracker.controller;

import com.portfolio.expensetracker.model.Budget;
import com.portfolio.expensetracker.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budgets")
public class BudgetController {

    @Autowired
    private BudgetService budgetService;

    @GetMapping
    public ResponseEntity<List<Budget>> getAllBudgets() {
        List<Budget> budgets = budgetService.getAllBudgets();
        return new ResponseEntity<>(budgets, HttpStatus.OK);
    }

    @GetMapping("/{budgetId}")
    public ResponseEntity<Budget> getBudgetById(@PathVariable Long budgetId) {
        Budget budget = budgetService.getBudgetById(budgetId);

        if (budget != null) {
            return new ResponseEntity<>(budget, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Void> createBudget(@RequestBody Budget budget) {
        budgetService.saveBudget(budget);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{budgetId}")
    public ResponseEntity<Void> updateBudget(@PathVariable Long budgetId, @RequestBody Budget updatedBudget) {
        Budget existingBudget = budgetService.getBudgetById(budgetId);

        if (existingBudget != null) {
            updatedBudget.setBudgetId(budgetId);
            budgetService.saveBudget(updatedBudget);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{budgetId}")
    public ResponseEntity<Void> deleteBudget(@PathVariable Budget budgetId) {
        budgetService.deleteBudget(budgetId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

