package com.jensderond;

import java.util.HashMap;
import java.util.Map;

public class Booking {
    private static int i = 1;
    private int id;

    private Customer customer;
	private State createdState;
	public State pendingState;
    public State paidState;
    public State canceledState;
    private Map<Integer, Ticket> ticketList = new HashMap<>();
    private State state;

    public Booking(Customer customer) {
        this.id = i++;

        this.customer = customer;
        this.createdState = new CreatedState(this);
        this.pendingState = new PendingState(this);
        this.paidState = new PaidState(this);
        this.canceledState = new CanceledState(this);
        this.state = createdState;

        Movie movie1 = new Movie("Gladiator", 9, "Beast movie");
        Movie movie2 = new Movie("The Simpsons", 11, "Cartoon movie");

        for ( int i = 0; i < 5; i++ ) {
            Ticket t;
            if( i % 2 == 0 ) {
                t = new Ticket(movie1);
            }
            else {
                t = new Ticket(movie2);
            }

            ticketList.put(t.getId(), t);
        }
    }

    public int getId() {
        return id;
    }

    public void createBooking() {
        this.state.create();
    }

    public void updateBooking() {
        this.state.update();
    }

    public void payBooking() {
        this.state.payBooking();
    }

    public void cancelBooking() {
        this.state.cancel();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void getTickets() {
        for (Object o : ticketList.entrySet()) {
            Map.Entry ticket = (Map.Entry) o;
            Ticket ticketObject = (Ticket)ticket.getValue();
            System.out.println(ticket.getKey() + " = " + ticketObject.getMovie().getName());
        }
	}
}