package com.jensderond;

import com.jensderond.Data.DataStorage;
import com.jensderond.Data.StorageFactory;
import com.jensderond.Message.MessageFactory;
import com.jensderond.Message.SendMessage;
import com.jensderond.States.*;

import java.util.HashMap;
import java.util.Map;

public class Booking {
    private static int i = 1;
    private int id;

    private Customer customer;
	public State createdState;
	public State pendingState;
    public State paidState;
    public State canceledState;
    private Map<Integer, Ticket> ticketList = new HashMap<>();
    private State state;
    private DataStorage dataStorage;
    private SendMessage messageMedium;

    public Booking(Customer customer, DataStorage storageType, SendMessage messageType) {
        this.id = i++;

        // Get storageType from factory
        this.dataStorage = storageType;
        this.dataStorage.getData();
        this.dataStorage.setData("Anton is awesome");

        // Get messageType from factory
        this.messageMedium = messageType;

        // Initialize all states
        this.createdState = new CreatedState(this);
        this.pendingState = new PendingState(this);
        this.paidState = new PaidState(this);
        this.canceledState = new CanceledState(this);
        this.state = createdState;

        this.customer = customer;
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

    public State getState() {
        return this.state;
    }

    public void getTickets() {
        for (Object o : ticketList.entrySet()) {
            Map.Entry ticket = (Map.Entry) o;
            Ticket ticketObject = (Ticket)ticket.getValue();
            System.out.println(ticket.getKey() + " = " + ticketObject.getMovie().getName());
        }
	}
}