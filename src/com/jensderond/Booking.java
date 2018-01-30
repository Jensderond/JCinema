package com.jensderond;

public class Booking {
    private static int i = 1;
    private int id;

    private Customer customer;
	private State createdState;
	private State pendingState;
	private State paidState;
    private State canceledState;
	private State state = this.createdState;

    public Booking(Customer customer) {
        this.id = i++;

        this.customer = customer;
        this.createdState = new CreatedState(this);
        this.pendingState = new PendingState(this);
        this.paidState = new PaidState(this);
        this.canceledState = new CanceledState(this);

    }

    public int getId() {
        return id;
    }

    public void getTickets() {
		// TODO - implement Booking.getTickets
		throw new UnsupportedOperationException();
	}
}