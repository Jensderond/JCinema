package com.jensderond.States;

import com.jensderond.Booking;

public class CreatedState extends State {
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
    public void cancel(){
        System.out.println( "You've just canceled this booking with ID: " + booking.getId() );
        booking.setState( booking.canceledState );
    }
}