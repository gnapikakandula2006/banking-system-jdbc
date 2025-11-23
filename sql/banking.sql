CREATE DATABASE banking_system;
USE banking_system;

CREATE TABLE accounts (
    acc_no INT PRIMARY KEY,
    name VARCHAR(100),
    balance DOUBLE
);

CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE,
    password VARCHAR(50)
);