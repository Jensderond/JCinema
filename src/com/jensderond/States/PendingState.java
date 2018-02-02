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
        booking.setLastModified();
    }

    @Override
    public void checkPaymentStatus() {
//        if ( booking.lastModified - booking.showTime < 1 ) {
//            booking.messageMedium.sendMessage( "You need to pay us boy", booking.customer );
//            booking.dataStorage.setData( "Pay reminder send to: " + booking.customer.getName() );
//        }
    }

    @Override
    public void payBooking() {
        System.out.println( "You have paid this booking" );
        booking.setLastModified();
        booking.setState( booking.paidState );
    }

    @Override
    public void cancel(){
        System.out.println( "You've just canceled this booking with ID: " + booking.getId() );
        booking.setLastModified();
        booking.setState( booking.canceledState );
    }
}