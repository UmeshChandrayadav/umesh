package com.tnsif.interface1;

class CreditCard implements payment {
    private String cardNumber;
    public CreditCard(String cardNumber) { this.cardNumber = cardNumber; }
    public void process(double amount) {
        System.out.println("Paid Rs. " + amount + " via Credit Card: ****" 
    + cardNumber.substring(cardNumber.length() - 3));
    }
}
 

