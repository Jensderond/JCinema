package com.jensderond;

public class Main {

    public Main() {
        Customer jens = new Customer("Jens");
        Booking booking = new Booking(jens);

        booking.getTickets();
    }

    public static void main(String[] args) {
	// write your code here
        new Main();
    }

}
