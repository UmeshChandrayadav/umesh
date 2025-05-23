package com.tnsif.OnlineTicketBooking;

public class TBooking {
	private static int ticket = 5;
	static {
		System.out.println("Welcome to the Online Ticket Booking System. \n"
				+ " The number of tickets available are: "+ticket);
	}

	void Tbooking() {
		if(ticket == 0)
			System.out.println("All tickets have sold out");
		else
			System.out.println("You have booked a ticket");
	}
	
	static void Tdisplay() {
		if(ticket!=0) {
			ticket--;
			System.out.println("The number of tickets available are: "+ticket);
		}
	}
	
	@Override
	public String toString() {
		return "TBooking []";
	}

}
