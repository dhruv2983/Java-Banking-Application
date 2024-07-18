package main;

import java.util.Scanner;

public class BankingApp {
    private static Bank bank = new Bank();
    private static Admin admin = new Admin(bank);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Customer Menu");
            System.out.println("2. Admin Menu");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    customerMenu();
                    break;
                case 2:
                    adminMenu();
                    break;
                case 3:
                    System.out.println("Thank you for using our banking system.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void customerMenu() {
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Create Customer");
            System.out.println("2. Create Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Return to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createCustomer();
                    break;
                case 2:
                    createAccount();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    checkBalance();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void adminMenu() {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. List All Customers");
            System.out.println("2. List All Accounts");
            System.out.println("3. Freeze Account");
            System.out.println("4. Unfreeze Account");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    admin.listAllCustomers();
                    break;
                case 2:
                    admin.listAllAccounts();
                    break;
                case 3:
                    System.out.print("Enter account number to freeze: ");
                    String freezeAccountNumber = scanner.nextLine();
                    admin.freezeAccount(freezeAccountNumber);
                    break;
                case 4:
                    System.out.print("Enter account number to unfreeze: ");
                    String unfreezeAccountNumber = scanner.nextLine();
                    admin.unfreezeAccount(unfreezeAccountNumber);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();

        Customer customer = new Customer(name, customerId);
        bank.addCustomer(customer);
        System.out.println("Customer created successfully.");
    }

    private static void createAccount() {
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        Customer customer = bank.findCustomer(customerId);

        if (customer != null) {
            System.out.print("Enter account number: ");
            String accountNumber = scanner.nextLine();
            System.out.print("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();

            Account account = new Account(accountNumber, initialBalance);
            customer.addAccount(account);
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void deposit() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = bank.findAccount(accountNumber);

        if (account != null) {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdraw() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = bank.findAccount(accountNumber);

        if (account != null) {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void checkBalance() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = bank.findAccount(accountNumber);

        if (account != null) {
            System.out.println("Current balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}