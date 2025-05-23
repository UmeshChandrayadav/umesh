package com.tnsif.interface1;

class UPI implements payment {
    private String upiId;
    public UPI(String upiId) { this.upiId = upiId; }
    public void process(double amount) {
        System.out.println("Paid Rs. " + amount + " via UPI ID: " + upiId);
    }
}
