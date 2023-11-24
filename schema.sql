CREATE DATABASE ExpenseTracker;

-- Create User table
CREATE TABLE ExpenseTracker.User (
    UserId SERIAL PRIMARY KEY,
    Email VARCHAR(255) NOT NULL,
    Phone VARCHAR(20),
    Password VARCHAR(255) NOT NULL
);

-- Create ExpenseCategory table
CREATE TABLE ExpenseTracker.ExpenseCategory (
    CategoryId SERIAL PRIMARY KEY,
    CategoryName VARCHAR(255) NOT NULL
);

-- Create Expense table
CREATE TABLE ExpenseTracker.Expense (
    ExpenseId SERIAL PRIMARY KEY,
    Amount NUMERIC NOT NULL,
    Currency VARCHAR(3), -- Assuming 3-character currency code
    UserId INT REFERENCES User(UserId),
    Description TEXT,
    CategoryId INT REFERENCES ExpenseCategory(CategoryId),
    Date DATE
);

-- Create Report table
CREATE TABLE ExpenseTracker.Report (
    ReportId SERIAL PRIMARY KEY,
    UserId INT REFERENCES User(UserId),
    ReportType VARCHAR(50) NOT NULL,
    Schedule VARCHAR(255), -- You may need to define a specific format for the schedule
    LastSentDate TIMESTAMP
);

-- Create Budget table
CREATE TABLE ExpenseTracker.Budget (
    BudgetId SERIAL PRIMARY KEY,
    UserId INT REFERENCES User(UserId),
    CategoryId INT REFERENCES ExpenseCategory(CategoryId),
    Amount NUMERIC NOT NULL,
    Period VARCHAR(20), -- e.g., month, week
    StartDate DATE,
    EndDate DATE
);

