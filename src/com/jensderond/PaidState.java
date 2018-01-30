package com.jensderond;

public class PaidState implements State {
    private Booking booking;

    public PaidState(Booking booking) {
        this.booking = booking;
    }

    @Override
    public void create() {
        System.out.println( "You can't a booking in paid state" );
    }

    @Override
    public void update() {
        System.out.println( "You can't update a booking in paid state" );
    }

    @Override
    public void payBooking() {
        System.out.println( "You can't pay the booking in paid state" );
        System.out.println( "Booking with ID: " + booking.getId() + " is already paid!" );
    }

    @Override
    public void cancel(){
        System.out.println( "You can't cancel the booking in paid state" );
    }
}