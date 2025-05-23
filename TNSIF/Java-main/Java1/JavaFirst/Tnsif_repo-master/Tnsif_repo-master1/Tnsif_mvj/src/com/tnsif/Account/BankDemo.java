package com.tnsif.Account;
import java.util.Scanner;
public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account s = new SavingsAccount(1000), c = new CheckingAccount(1100);
        while (true) {
            System.out.println("1.Savings 2.Checking 3.Exit");
            int a = sc.nextInt(); if (a == 3) break;
            Account acc = (a == 1) ? s : c;
            System.out.println("1.Deposit 2.Withdraw 3.Balance");
            switch (sc.nextInt()) {
                case 1 -> acc.deposit(sc.nextDouble());
                case 2 -> acc.withdraw(sc.nextDouble());
                case 3 -> acc.showBalance();
            }
        }
        sc.close();
    }
}
