package com.jensderond;

public class PaidState implements State {
    private Booking booking;

    public PaidState(Booking booking) {
        this.booking = booking;
    }

    @Override
    public void get() {

    }

    @Override
    public void update() {

    }

    @Override
    public void rollback() {

    }
}