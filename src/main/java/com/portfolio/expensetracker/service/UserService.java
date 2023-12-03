package com.portfolio.expensetracker.service;

import com.portfolio.expensetracker.model.User;
import com.portfolio.expensetracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    public User getUserByUsername(User user) { return userRepository.findByUsername(user); }
    public User getUserByEmail(String email ) { return userRepository.findByEmail(email);}
    public User getUserByPhone(String phone) {return userRepository.findByPhone(phone);}
}
