package com.portfolio.expensetracker.model;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Report {
    private long reportId;
    private long userId;
    private LocalDate generatedOnDate;

    public Report(long reportId, long userId, LocalDate generatedOnDate) {
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

    public long getUserId() {
        return userId;
    }

    public Report setUserId(long userId) {
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
