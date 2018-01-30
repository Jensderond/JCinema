package com.jensderond;

public class PendingState implements State {
    private Booking booking;

    public PendingState(Booking booking) {
        this.booking = booking;
    }

    @Override
    public void create() {
        System.out.println();
    }

    @Override
    public void update() {
        System.out.println();
    }

    @Override
    public void payBooking() {

    }

    @Override
    public void cancel(){

    }
}