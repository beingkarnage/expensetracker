package com.portfolio.expensetracker.repository;

import com.portfolio.expensetracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(User user);
    public User findByEmail(String email);
    public User findByPhone(String phone);
}
