package com.tnsif.interface1;

class DebitCard implements payment {
    private String cardNumber;
    public DebitCard(String cardNumber) { this.cardNumber = cardNumber; }
    public void process(double amount) {
        System.out.println("Paid Rs. " + amount + " via Debit Card: ****" 
    + cardNumber.substring(cardNumber.length()-3));
    }
}
 