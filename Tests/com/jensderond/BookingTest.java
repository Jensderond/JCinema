package com.jensderond;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class BookingTest {
    private Customer customer;
    private Booking booking;

    @Before
    public void setUp() {
        this.customer = new Customer("Jens");
        this.booking = new Booking(this.customer);
    }

    @After
    public void tearDown() {
        this.customer = null;
        this.booking = null;
    }

    @org.junit.Test
    public void createBookingInCreateState() {
        this.booking.createBooking();

        assertEquals("Create booking in default Create state", this.booking.pendingState.getClass(), this.booking.getState().getClass());
    }

    @org.junit.Test
    public void createBookingInPendingState() {
        this.booking.createBooking();
        this.booking.createBooking();

        assertEquals("Create booking in the Paid state", this.booking.pendingState.getClass(), this.booking.getState().getClass());
    }

    @org.junit.Test
    public void createBookingInPaidState() {
        this.booking.createBooking();
        this.booking.payBooking();
        this.booking.createBooking();

        assertEquals("Create booking in the Paid state", this.booking.paidState.getClass(), this.booking.getState().getClass());
    }

    @org.junit.Test
    public void createBookingInCanceledState() {
        this.booking.cancelBooking();
        this.booking.createBooking();

        assertEquals("Create booking in the Canceled state", this.booking.canceledState.getClass(), this.booking.getState().getClass());
    }

    @org.junit.Test
    public void updateBookingInCreateState() {
        this.booking.updateBooking();

        assertEquals("Update booking in the Create state", this.booking.createdState.getClass(), this.booking.getState().getClass());
    }

    @org.junit.Test
    public void updateBookingInPendingState() {
        this.booking.createBooking();
        this.booking.updateBooking();

        assertEquals("Update booking in the Pending state", this.booking.pendingState.getClass(), this.booking.getState().getClass());
    }

    @org.junit.Test
    public void updateBookingInPaidState() {
        this.booking.createBooking();
        this.booking.payBooking();
        this.booking.updateBooking();

        assertEquals("Update booking in the Paid state", this.booking.paidState.getClass(), this.booking.getState().getClass());
    }

    @org.junit.Test
    public void updateBookingInCanceledState() {
        this.booking.cancelBooking();
        this.booking.updateBooking();

        assertEquals("Update booking in the Canceled state", this.booking.canceledState.getClass(), this.booking.getState().getClass());
    }

    @org.junit.Test
    public void payBookingInCreateState() {
        this.booking.payBooking();

        assertEquals("Pay booking in the Create state", this.booking.createdState.getClass(), this.booking.getState().getClass());
    }

    @org.junit.Test
    public void payBookingInPendingState() {
        this.booking.createBooking();
        this.booking.payBooking();

        assertEquals("Pay booking in the Pending state", this.booking.paidState.getClass(), this.booking.getState().getClass());
    }

    @org.junit.Test
    public void payBookingInPaidState() {
        this.booking.createBooking();
        this.booking.payBooking();
        this.booking.payBooking();

        assertEquals("Pay booking in the Paid state", this.booking.paidState.getClass(), this.booking.getState().getClass());
    }


}