package com.jensderond;

public class CreatedState implements State {
    private Booking booking;

    public CreatedState(Booking booking) {
        this.booking = booking;
    }

    @Override
    public void create() {
        System.out.println( "You've just created a booking in created state" );
        booking.setState( booking.pendingState );
    }

    @Override
    public void update() {
        System.out.println( "You can't update a booking in created state" );
    }

    @Override
    public void payBooking() {
        System.out.println( "You can't pay the booking in created state" );
    }

    @Override
    public void cancel(){
        System.out.println( "You've just canceled this booking with ID: " + booking.getId() );
        booking.setState( booking.canceledState );
    }
}