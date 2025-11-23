# Banking System JDBC 

A simple console-based banking system built with **Java** and **MySQL**.  
It supports account creation, deposit, withdrawal, and balance check operations, with data stored in a MySQL database.

---

## 🚀 Technologies Used
- Java 17
- MySQL 8+
- JDBC (MySQL Connector/J 9.0.0)
- MySQL Command Line Client
- VS Code (optional)

---

## 📁 Project Structure

banking-system-jdbc/
├── src/                        # Source code
│   ├── Main.java               # Entry point with menu loop
│   ├── dao/
│   │   └── BankDAO.java        # Data Access Object (JDBC logic for CRUD operations)
│   ├── model/
│   │   └── Account.java        # Account entity (id, name, balance)
│   └── util/
│       └── DBConnection.java   # Utility class for MySQL connection
│
├── sql/
│   └── banking.sql             # SQL script to create database and tables
│
├── lib/
│   └── mysql-connector-j-9.0.0.jar   # JDBC driver dependency
│
├── bin/                        # Compiled .class files (generated after javac)
│
├── README.md                   # Documentation (overview, setup, run instructions)
│
└── .gitignore (optional)       # Ignore bin/ and .class files if used

---

## 🛠️ Setup Instructions

1. **Create MySQL Database**
   - Open MySQL CLI
   - Run:
     ```sql
     SOURCE C:/Users/Dell/banking-system-jdbc/sql/banking.sql;
     ```

2. **Compile Java Code**
   ```cmd
   javac --release 17 -cp lib\mysql-connector-j-9.0.0.jar -d bin src\Main.java src\dao\BankDAO.java src\model\Account.java src\util\DBConnection.java

##   ▶️ Run Command
```cmd
java -cp bin;lib\mysql-connector-j-9.0.0.jar Main
```

## 📋 Features

- Create new bank accounts
- Deposit money
- Withdraw money
- Check account balance
- Data stored persistently in MySQL

## 🧪 Example Usage
```cmd
🏦 Banking System Menu
1. Create Account
2. Deposit
3. Withdraw
4. Check Balance
5. Exit
Enter choice: 1
Enter Account No: 1001
Enter Name: Gnapika
Enter Initial Balance: 5000
✔ Account created successfully!
```


## 👤 Author

Gnapika
Focused, methodical, and resourceful — blending precision with dignity.

## Commit and push:  

  git add README.md
  git commit -m "Update README with run command"
  git push


