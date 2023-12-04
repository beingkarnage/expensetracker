package com.portfolio.expensetracker.controller;

import com.portfolio.expensetracker.model.Expense;
import com.portfolio.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping
    public ResponseEntity<List<Expense>> getAllExpenses() {
        List<Expense> expenses = expenseService.getAllExpense();
        return new ResponseEntity<>(expenses, HttpStatus.OK);
    }

    @GetMapping("/{expenseId}")
    public ResponseEntity<Expense> getExpenseById(@PathVariable Long expenseId) {
        Expense expense = expenseService.getExpenseById(expenseId);

        if (expense != null) {
            return new ResponseEntity<>(expense, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Void> createExpense(@RequestBody Expense expense) {
        expenseService.saveExpense(expense);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{expenseId}")
    public ResponseEntity<Void> updateExpense(@PathVariable Long expenseId, @RequestBody Expense updatedExpense) {
        Expense existingExpense = expenseService.getExpenseById(expenseId);

        if (existingExpense != null) {
            updatedExpense.setExpenseId(expenseId);
            expenseService.saveExpense(updatedExpense);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{expenseId}")
    public ResponseEntity<Void> deleteExpense(@PathVariable Expense expenseId) {
        expenseService.deleteExpense(expenseId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
