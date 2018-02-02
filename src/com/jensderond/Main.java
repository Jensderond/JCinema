package com.jensderond;

import com.jensderond.Data.DataStorage;
import com.jensderond.Data.StorageFactory;
import com.jensderond.Message.MessageFactory;
import com.jensderond.Message.SendMessage;


public class Main {

    public Main() {
        Customer jens = new Customer("Jens");

        MessageFactory messageFactory = new MessageFactory();
        SendMessage messageMedium = messageFactory.getMessageType("SMS");
        StorageFactory storageFactory = new StorageFactory();
        DataStorage dataStorage = storageFactory.getStorage("EVENT");

        Booking booking = new Booking(jens, dataStorage, messageMedium);
        booking.createBooking();
        booking.cancelBooking();
        booking.payBooking();
    }

    public static void main(String[] args) {
	// write your code here
        new Main();
    }

}
