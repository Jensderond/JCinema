package com.jensderond.States;

import com.jensderond.Booking;

public class PendingState extends State {
    private Booking booking;

    public PendingState(Booking booking) {
        this.booking = booking;
    }

    @Override
    public void update() {
        System.out.println( "You can still update a booking in this state" );
    }

    @Override
    public void payBooking() {
        System.out.println( "You have paid this booking" );
        booking.setState( booking.paidState );
    }

    @Override
    public void cancel(){
        System.out.println( "You've just canceled this booking with ID: " + booking.getId() );
        booking.setState( booking.canceledState );
    }
}