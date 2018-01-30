package com.jensderond;

public class PendingState implements State {
    private Booking booking;

    public PendingState(Booking booking) {
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