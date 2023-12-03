package com.portfolio.expensetracker.repository;

import com.portfolio.expensetracker.model.Budget;
import com.portfolio.expensetracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {
    public List<Budget> findByUserId(User user);
}
