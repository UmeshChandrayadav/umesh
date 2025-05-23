package com.tnsif.OnlineTicketBooking;

public class DemoTicketB {
	public static void main(String[] args) {
		TBooking book = new TBooking();
		for(int i = 0; i<=5; i++) {
			book.Tbooking();
			TBooking.Tdisplay();
		}
	}

}
