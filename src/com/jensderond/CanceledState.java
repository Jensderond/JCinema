package com.jensderond;

public class CanceledState implements State {
    private Booking booking;

    public CanceledState(Booking booking) {
        this.booking = booking;
    }

    @Override

    public void get() {

    }

    @Override
    public void update() {

    }

    @Override
    public void payBooking() {

    }

    @Override
    public void cancel(){

    }

}