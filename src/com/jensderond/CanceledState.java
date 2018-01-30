package com.jensderond;

public class CanceledState implements State {
    private Booking booking;

    public CanceledState(Booking booking) {
        this.booking = booking;
    }

    @Override
    public void create() {
        System.out.println( "You can't created a booking in cancel state" );
    }

    @Override
    public void update() {
        System.out.println( "You can't update a booking in cancel state" );
    }

    @Override
    public void payBooking() {
        System.out.println( "You can't pay the booking in cancel state" );
    }

    @Override
    public void cancel(){
        System.out.println( "Booking with ID: " + booking.getId() + " is already canceled!" );
    }
}