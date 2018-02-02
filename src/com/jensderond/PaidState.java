package com.jensderond;

public class PaidState extends State {
    private Booking booking;

    public PaidState(Booking booking) {
        this.booking = booking;
    }

}