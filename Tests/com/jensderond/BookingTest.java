package com.jensderond;

import com.jensderond.Data.DataStorage;
import com.jensderond.Data.StorageFactory;
import com.jensderond.Message.MessageFactory;
import com.jensderond.Message.SendMessage;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class BookingTest {
    private Customer customer;
    private Booking booking;

    @Before
    public void setUp() {

        MessageFactory messageFactory = new MessageFactory();
        SendMessage messageMedium = messageFactory.getMessageType("SMS");
        StorageFactory storageFactory = new StorageFactory();
        DataStorage dataStorage = storageFactory.getStorage("EVENT");
        this.customer = new Customer("Jens");
        this.booking = new Booking(this.customer, dataStorage, messageMedium );
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

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void createBookingInPendingState() {
        this.booking.createBooking();
        this.booking.createBooking();
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void createBookingInPaidState() {
        this.booking.createBooking();
        this.booking.payBooking();
        this.booking.createBooking();
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void createBookingInCanceledState() {
        this.booking.cancelBooking();
        this.booking.createBooking();
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void updateBookingInCreateState() {
        this.booking.updateBooking();
    }

    @org.junit.Test
    public void updateBookingInPendingState() {
        this.booking.createBooking();
        this.booking.updateBooking();

        assertEquals("You can Update booking in the Pending state", this.booking.pendingState.getClass(), this.booking.getState().getClass());
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void updateBookingInPaidState() {
        this.booking.createBooking();
        this.booking.payBooking();
        this.booking.updateBooking();
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void updateBookingInCanceledState() {
        this.booking.cancelBooking();
        this.booking.updateBooking();
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void payBookingInCreateState() {
        this.booking.payBooking();
    }

    @org.junit.Test
    public void payBookingInPendingState() {
        this.booking.createBooking();
        this.booking.payBooking();

        assertEquals("You can Pay booking in the Pending state", this.booking.paidState.getClass(), this.booking.getState().getClass());
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void payBookingInPaidState() {
        this.booking.createBooking();
        this.booking.payBooking();
        this.booking.payBooking();
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void payBookingInCanceledState(){
        this.booking.cancelBooking();
        this.booking.payBooking();
    }

    @org.junit.Test
    public void cancelBookingInCreatedState(){
        this.booking.cancelBooking();

        assertEquals("You can cancel a booking in create state", this.booking.canceledState.getClass(), this.booking.getState().getClass());
    }

    @org.junit.Test
    public void cancelBookingInPendingState(){
        this.booking.createBooking();
        this.booking.cancelBooking();

        assertEquals("You can cancel a booking in pending state", this.booking.canceledState.getClass(), this.booking.getState().getClass());
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void cancelBookingInPaidState(){
        this.booking.createBooking();
        this.booking.payBooking();
        this.booking.cancelBooking();
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void cancelBookingInCancelState(){
        this.booking.createBooking();
        this.booking.cancelBooking();
        this.booking.cancelBooking();
    }

}