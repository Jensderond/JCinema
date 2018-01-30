package com.jensderond;

public class PendingState implements State {
    private Booking booking;

    public PendingState(Booking booking) {
        this.booking = booking;
    }

    @Override
    public void create() {
        System.out.println( "You can't create a booking in this state" );
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