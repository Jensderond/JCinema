package com.jensderond.States;

import com.jensderond.Booking;

public class CanceledState extends State {
    private Booking booking;

    public CanceledState(Booking booking) {
        this.booking = booking;
    }

}