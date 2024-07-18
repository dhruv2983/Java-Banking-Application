package main;

import java.util.List;

public class Admin {
    private Bank bank;

    public Admin(Bank bank) {
        this.bank = bank;
    }

    public void listAllCustomers() {
        List<Customer> customers = bank.getAllCustomers();
        System.out.println("All Customers:");
        for (Customer customer : customers) {
            System.out.println("ID: " + customer.getCustomerId() + ", Name: " + customer.getName());
        }
    }

    public void listAllAccounts() {
        List<Customer> customers = bank.getAllCustomers();
        System.out.println("All Accounts:");
        for (Customer customer : customers) {
            for (Account account : customer.getAccounts()) {
                System.out.println("Account Number: " + account.getAccountNumber() + 
                                   ", Balance: " + account.getBalance() + 
                                   ", Owner: " + customer.getName());
            }
        }
    }

    public void freezeAccount(String accountNumber) {
        Account account = bank.findAccount(accountNumber);
        if (account != null) {
            account.setFrozen(true);
            System.out.println("Account " + accountNumber + " has been frozen.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void unfreezeAccount(String accountNumber) {
        Account account = bank.findAccount(accountNumber);
        if (account != null) {
            account.setFrozen(false);
            System.out.println("Account " + accountNumber + " has been unfrozen.");
        } else {
            System.out.println("Account not found.");
        }
    }
}