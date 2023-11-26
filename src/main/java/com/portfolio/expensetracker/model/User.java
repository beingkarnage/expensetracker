package com.portfolio.expensetracker.model;

import jakarta.persistence.Entity;

@Entity
public class User {
    private long userId;
    private String email;
    private String phone;
    private String password;
    private String username;

    public User(long userId, String email, String phone, String password, String username) {
        this.userId = userId;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.username = username;
    }

    public User(long userId, String email, String password, String username) {
        this(userId, email,"",password, username);
    }

    public long getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public User setUserId(long userId) {
        this.userId = userId;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }
}
