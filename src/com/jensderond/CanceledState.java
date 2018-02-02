package com.jensderond;

public class CanceledState extends State {
    private Booking booking;

    public CanceledState(Booking booking) {
        this.booking = booking;
    }

}