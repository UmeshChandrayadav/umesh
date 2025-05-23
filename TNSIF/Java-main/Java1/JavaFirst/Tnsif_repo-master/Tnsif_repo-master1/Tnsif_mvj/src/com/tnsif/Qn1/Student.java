package com.tnsif.Qn1;

	import java.util.Scanner;
	public class Student {
		Student() {
	        System.out.println("Student object is created");
	    }
	}
	class Commission {    
	    private String name, address, phone;
	    private double salesAmount;	    
	    public void acceptDetails() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Name: ");
	        name = sc.nextLine();
	        System.out.print("Enter Address: ");
	        address = sc.nextLine();
	        System.out.print("Enter Phone: ");
	        phone = sc.nextLine();
	        System.out.print("Enter Sales Amount: ");
	        salesAmount = sc.nextDouble();
	    } 
	    public void calculateCommission() {
	        double commission = 0;
	        if (salesAmount >= 100000) {
	            commission = salesAmount * 0.10;
	        } else if (salesAmount >= 50000) {
	            commission = salesAmount * 0.05;
	        } else if (salesAmount >= 30000) {
	            commission = salesAmount * 0.03;
	        }
	        System.out.println("Commission for " + name + " is: Rs. " + commission);
	    }
}
