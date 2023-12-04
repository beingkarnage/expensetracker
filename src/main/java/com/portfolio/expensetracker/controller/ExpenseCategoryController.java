package com.portfolio.expensetracker.controller;


import com.portfolio.expensetracker.model.Budget;
import com.portfolio.expensetracker.model.Expense;
import com.portfolio.expensetracker.model.ExpenseCategory;
import com.portfolio.expensetracker.service.ExpenseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenseCategory")
public class ExpenseCategoryController {
    @Autowired
    private ExpenseCategoryService expenseCategoryService;

    @GetMapping
    public ResponseEntity<List<ExpenseCategory>> getAllExpenseCategory() {
        List<ExpenseCategory> expenseCategories = expenseCategoryService.getAllExpenseCategory();
        return new ResponseEntity<>(expenseCategories, HttpStatus.OK);
    }

    @GetMapping("/{expenseCategoryId}")
    public ResponseEntity<ExpenseCategory> getExpenseCategoryById(@PathVariable Long id) {
        return new ResponseEntity<>(expenseCategoryService.getExpenseCategoryById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createExpenseCategory(@RequestBody ExpenseCategory expense) {
        expenseCategoryService.saveExpenseCategory(expense);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{expenseCategoryId}")
    public ResponseEntity<Void> updateExpenseCategory(@PathVariable Long expenseCategoryId, @RequestBody ExpenseCategory updatedExpenseCategory) {
        ExpenseCategory existingExpenseCategory = expenseCategoryService.getExpenseCategoryById(expenseCategoryId);
        if (existingExpenseCategory != null) {
            updatedExpenseCategory.setExpenseIdCategoryId(expenseCategoryId);
            expenseCategoryService.saveExpenseCategory(updatedExpenseCategory);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{expenseCategoryId}")
    public ResponseEntity<Void> deleteBudget(@PathVariable ExpenseCategory expenseCategory) {
        expenseCategoryService.deleteExpenseCategory(expenseCategory);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
