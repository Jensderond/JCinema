package com.jensderond;

public class PaidState implements State {
    private Booking booking;

    public PaidState(Booking booking) {
        this.booking = booking;
    }

    @Override
    public void create() {
        System.out.println("");
    }

    @Override
    public void update() {
        System.out.println("je de booking niet aanpassen");
    }

    @Override
    public void payBooking() {
        System.out.println("betaal de boeking");
        booking.stat
    }

    @Override
    public void cancel(){

    }
}