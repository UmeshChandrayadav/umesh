package com.tnsif.BANKINGSYSTEM;

import java.util.*;
public class BankingSystemApp {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       BankingService service = new BankingServiceImpl();
       while (true) {
           System.out.println("\nBanking System");
           System.out.println("1. Add Customer");
           System.out.println("2. Add Account");
           System.out.println("3. Add Beneficiary");
           System.out.println("4. Add Transaction");
           System.out.println("5. Find Customer by Id");
           System.out.println("6. List all Accounts of a Customer");
           System.out.println("7. List all Transactions of an Account");
           System.out.println("8. List all Beneficiaries of a Customer");
           System.out.println("9. Exit");
           System.out.print("Enter your choice: ");
           int choice = s.nextInt();
           switch (choice) {
               case 1:
                   System.out.print("Enter Customer ID: ");
                   int cid = s.nextInt();
                   s.nextLine();
                   System.out.print("Name: ");
                   String name = s.nextLine();
                   System.out.print("Address: ");
                   String address = s.nextLine();
                   System.out.print("Contact: ");
                   String contact = s.nextLine();
                   service.addCustomer(new Customer(cid, name, address, contact));
                   break;
               case 2:
                   System.out.print("Enter Account ID: ");
                   int aid = s.nextInt();
                   System.out.print("Customer ID: ");
                   int custId = s.nextInt();
                   s.nextLine();
                   System.out.print("Account Type: ");
                   String type = s.nextLine();
                   System.out.print("Balance: ");
                   double bal = s.nextDouble();
                   service.addAccount(new Account(aid, custId, type, bal));
                   break;
               case 3:
                   System.out.print("Enter Beneficiary ID: ");
                   int bid = s.nextInt();
                   System.out.print("Customer ID: ");
                   int bcid = s.nextInt();
                   s.nextLine();
                   System.out.print("Name: ");
                   String bname = s.nextLine();
                   System.out.print("Account Number: ");
                   String accNo = s.nextLine();
                   System.out.print("Bank Details: ");
                   String bank = s.nextLine();
                   service.addBeneficiary(new Beneficiary(bid, bcid, bname, accNo, bank));
                   break;
               case 4:
                   System.out.print("Enter Account ID: ");
                   int transAccId = s.nextInt();
                   s.nextLine();
                   System.out.print("Type (Deposit/Withdrawal): ");
                   String transType = s.nextLine();
                   System.out.print("Amount: ");
                   double amt = s.nextDouble();
                   service.addTransaction(new Transaction(transAccId, transType, amt));
                   break;
               case 5:
                   System.out.print("Enter Customer ID: ");
                   int findCid = s.nextInt();
                   System.out.println(service.findCustomerById(findCid));
                   break;
               case 6:
                   System.out.print("Enter Customer ID: ");
                   int listAccCid = s.nextInt();
                   List<Account> accList = service.getAccountsByCustomerId(listAccCid);
                   accList.forEach(System.out::println);
                   break;
               case 7:
                   System.out.print("Enter Account ID: ");
                   int listTransAid = s.nextInt();
                   List<Transaction> transList = service.getTransactionsByAccountId(listTransAid);
                   transList.forEach(System.out::println);
                   break;
               case 8:
                   System.out.print("Enter Customer ID: ");
                   int listBenCid = s.nextInt();
                   List<Beneficiary> benList = service.getBeneficiariesByCustomerId(listBenCid);
                   benList.forEach(System.out::println);
                   break;
               case 9:
                   System.out.println("Thank you!");
                   System.exit(0);
           }
       }
   }
}

