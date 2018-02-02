package com.jensderond.States;

import com.jensderond.Booking;

public class PaidState extends State {
    private Booking booking;

    public PaidState(Booking booking) {
        this.booking = booking;
    }

}