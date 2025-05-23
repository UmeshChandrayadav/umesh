package com.tnsif.interface1;

public class Demo {
    public static void main(String[] args) {
    	payment c=new CreditCard("R12322");
    	payment d=new DebitCard("D234a");
    	c.process(99);
    	d.process(99);
    }}