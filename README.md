# Simple Java Banking System

## Description

This Simple Java Banking System is a console-based application that simulates basic banking operations. It demonstrates the use of Object-Oriented Programming (OOP) principles in Java. The system allows for customer account management and includes an administrative interface for bank employees. Users can create accounts, perform deposits and withdrawals, and check balances. The admin panel provides functionality to list all customers and accounts, as well as freeze or unfreeze accounts. This project serves as a foundation for understanding core banking operations and can be extended with more advanced features like data persistence, security measures, and additional banking products.

## Features

- Customer Operations:
  - Create new customers
  - Create bank accounts
  - Deposit money
  - Withdraw money
  - Check account balance

- Admin Operations:
  - List all customers
  - List all accounts
  - Freeze accounts
  - Unfreeze accounts

## Project Structure

&nbsp;&nbsp;&nbsp;&nbsp;BankingSystem/
&nbsp;&nbsp;&nbsp;&nbsp;├── src/
&nbsp;&nbsp;&nbsp;&nbsp;│   ├── main/
&nbsp;&nbsp;&nbsp;&nbsp;│   │   ├── Account.java
&nbsp;&nbsp;&nbsp;&nbsp;│   │   ├── Admin.java
&nbsp;&nbsp;&nbsp;&nbsp;│   │   ├── Bank.java
&nbsp;&nbsp;&nbsp;&nbsp;│   │   ├── BankingApp.java
&nbsp;&nbsp;&nbsp;&nbsp;│   │   └── Customer.java
&nbsp;&nbsp;&nbsp;&nbsp;└── README.md

## How to Run

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Compile the Java files:
&nbsp;&nbsp;&nbsp;&nbsp;javac src/main/*.java
3. Run the BankingApp class:
&nbsp;&nbsp;&nbsp;&nbsp;java -cp src main.BankingApp
4. Follow the on-screen prompts to use the banking system.

## Future Enhancements

- Implement data persistence (database or file storage)
- Add more account types (savings, fixed deposit)
- Implement interest calculation
- Add transaction history
- Improve security with user authentication

## Contributing

Feel free to fork this project and submit pull requests with improvements or additional features.
