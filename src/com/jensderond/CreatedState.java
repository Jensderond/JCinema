package com.jensderond;

public class CreatedState implements State {
    private Booking booking;

    public CreatedState(Booking booking) {
        this.booking = booking;
    }

    @Override

    public void get() {
        System.out.println("Get created booking.");
    }

    @Override
    public void update() {
        System.out.println("Get created booking.");
    }

    @Override
    public void payBooking() {

    }

    @Override
    public void cancel(){

    }
}