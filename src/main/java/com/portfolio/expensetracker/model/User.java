package com.portfolio.expensetracker.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "user_profile",
        uniqueConstraints = {
                @UniqueConstraint(name = "user_email_unique", columnNames = "email"),
                @UniqueConstraint(name = "user_phone_unique", columnNames = "phone"),
                @UniqueConstraint(name = "user_phone_username", columnNames = "username"),
        }
)
public class User {
    public User() {}
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "expense_sequence" //test
    )
    @Column(name = "user_id", updatable = false)
    private long userId;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "username", nullable = false)
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
