package com.tnsif.Account;

abstract class Account {
    protected double balance;
    Account(double balance) { this.balance = balance; }
    abstract void deposit(double amt);
    abstract void withdraw(double amt);
    void showBalance() { System.out.println("Balance: " + balance); }
}

class SavingsAccount extends Account {
    SavingsAccount(double b) { super(b); }
    void deposit(double amt) { balance += amt * 1.05; }
    void withdraw(double amt) { if (balance >= amt) balance -= amt; }
}

class CheckingAccount extends Account {
    CheckingAccount(double b) { super(b); }
    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) { if (balance + 50000 >= amt) balance -= amt; }
}





