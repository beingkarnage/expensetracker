package com.portfolio.expensetracker.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "report")
public class Report {
    public Report() {}
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(name = "id")
    private long reportId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id", nullable = false)
    private User userId;
    @Temporal(value = TemporalType.DATE)
    private LocalDate generatedOnDate;

    public Report(long reportId, User userId, LocalDate generatedOnDate) {
        this.reportId = reportId;
        this.userId = userId;
        this.generatedOnDate = generatedOnDate;
    }

    public long getReportId() {
        return reportId;
    }

    public Report setReportId(long reportId) {
        this.reportId = reportId;
        return this;
    }

    public User getUserId() {
        return userId;
    }

    public Report setUserId(User userId) {
        this.userId = userId;
        return this;
    }

    public LocalDate getGeneratedOnDate() {
        return generatedOnDate;
    }

    public Report setGeneratedOnDate(LocalDate generatedOnDate) {
        this.generatedOnDate = generatedOnDate;
        return this;
    }
}
